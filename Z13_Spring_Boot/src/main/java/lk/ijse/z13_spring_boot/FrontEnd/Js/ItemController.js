$(document).ready(function () {
    loadItems();

    let selectedItemCode = null;

    function loadItems() {
        $.ajax({
            url: "http://localhost:8080/api/v1/item/getAll",
            type: "GET",
            success: function (data) {
                let tbody = $("table tbody");
                tbody.empty();
                data.forEach(item => {
                    tbody.append(`<tr data-code="${item.code}" data-itemName="${item.itemName}" data-qty="${item.qty}" data-price="${item.price}">
                        <td>${item.code}</td>
                        <td>${item.itemName}</td>
                        <td>${item.qty}</td>
                        <td>${item.price}</td>
                        <td>
                            <button class="update-btn" data-code="${item.code}" data-itemName="${item.itemName}" data-qty="${item.qty}" data-price="${item.price}">Update</button>
                            <button class="delete-btn" data-code="${item.code}">Delete</button>
                        </td>
                    </tr>`);
                });
            },
            error: function () {
                alert("Error loading items!");
            }
        });
    }

    $("#itemForm").submit(function (event) {
        event.preventDefault();

        let itemName = $("#name").val();
        let qty = $("#qty").val();
        let price = $("#price").val();

        if (!itemName || !qty || !price) {
            alert("Please fill in all fields!");
            return;
        }

        $.ajax({
            url: "http://localhost:8080/api/v1/item/save",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({ itemName: itemName, qty: qty, price: price }),
            success: function () {
                alert("Item added successfully!");
                $("#itemForm")[0].reset();
                loadItems();
            },
            error: function () {
                alert("Error adding item!");
            }
        });
    });

    $(document).on("click", "table tbody tr", function () {
        selectedItemCode = $(this).data("code");
        let itemName = $(this).data("itemname");
        let qty = $(this).data("qty");
        let price = $(this).data("price");

        $("#name").val(itemName);
        $("#qty").val(qty);
        $("#price").val(price);
        $(".save-btn").text("Update Item");
    });

    $("#itemForm").submit(function (event) {
        event.preventDefault();

        let itemName = $("#name").val();
        let qty = $("#qty").val();
        let price = $("#price").val();

        if (!selectedItemCode) {
            alert("No item selected for updating!");
            return;
        }

        $.ajax({
            url: `http://localhost:8090/api/v2/item/${selectedItemCode}`,
            type: "PUT",
            contentType: "application/json",
            data: JSON.stringify({ itemName: itemName, qty: qty, price: price }),
            success: function () {
                alert("Item updated successfully!");
                selectedItemCode = null;
                $(".save-btn").text("Add Item");
                $("#itemForm")[0].reset();
                loadItems();
            },
            error: function () {
                alert("Error updating item!");
            }
        });
    });

    $(document).on("click", ".delete-btn", function () {
        let itemCode = $(this).data("code");
        if (confirm("Are you sure you want to delete this item?")) {
            $.ajax({
                url: `http://localhost:8090/api/v2/item/${itemCode}`,
                type: "DELETE",
                success: function () {
                    alert("Item deleted successfully!");
                    loadItems();
                },
                error: function () {
                    alert("Error deleting item!");
                }
            });
        }
    });
});
