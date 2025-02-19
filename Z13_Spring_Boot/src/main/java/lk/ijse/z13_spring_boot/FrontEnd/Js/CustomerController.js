$(document).ready(function () {
    loadCustomers();

    let selectedCustomerId = null;

    function loadCustomers() {
        $.ajax({
            url: "http://localhost:8080/api/v2/customer",
            type: "GET",
            success: function (data) {
                let tbody = $("table tbody");
                tbody.empty();
                data.forEach(customer => {
                    tbody.append(`<tr data-id="${customer.id}" data-name="${customer.name}" data-address="${customer.address}">
                        <td>${customer.id}</td>
                        <td>${customer.name}</td>
                        <td>${customer.address}</td>
                        <td>
                            <button class="update-btn" data-id="${customer.id}" data-name="${customer.name}" data-address="${customer.address}">Update</button>
                            <button class="delete-btn" data-id="${customer.id}">Delete</button>
                        </td>
                    </tr>`);
                });
            },
            error: function () {
                alert("Error loading customers!");
            }
        });
    }

    // Add customer
    $("#customerForm").submit(function (event) {
        event.preventDefault();

        let name = $("#name").val();
        let address = $("#address").val();

        if (!name || !address) {
            alert("Please fill in all fields!");
            return;
        }

        $.ajax({
            url: "http://localhost:8080/api/v2/customer",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({ name: name, address: address }),
            success: function () {
                alert("Customer added successfully!");
                $("#customerForm")[0].reset();
                loadCustomers(); // Reload customer list
            },
            error: function () {
                alert("Error adding customer!");
            }
        });
    });

    // Load customer for updating
    $(document).on("click", "table tbody tr", function () {
        selectedCustomerId = $(this).data("id");
        let name = $(this).data("name");
        let address = $(this).data("address");

        $("#name").val(name);
        $("#address").val(address);
        $(".save-btn").text("Update Customer");
    });

    // Update customer
    $("#customerForm").submit(function (event) {
        event.preventDefault();

        let name = $("#name").val();
        let address = $("#address").val();

        if (!selectedCustomerId) {
            alert("No customer selected for updating!");
            return;
        }

        $.ajax({
            url: `http://localhost:8080/api/v2/customer/${selectedCustomerId}`,
            type: "PUT",
            contentType: "application/json",
            data: JSON.stringify({ name: name, address: address }),
            success: function () {
                alert("Customer updated successfully!");
                selectedCustomerId = null;
                $(".save-btn").text("Save Customer");
                $("#customerForm")[0].reset();
                loadCustomers(); // Reload customer list
            },
            error: function () {
                alert("Error updating customer!");
            }
        });
    });

    // Delete customer
    $(document).on("click", ".delete-btn", function () {
        let customerId = $(this).data("id");
        if (confirm("Are you sure you want to delete this customer?")) {
            $.ajax({
                url: `http://localhost:8080/api/v2/customer/${customerId}`,
                type: "DELETE",
                success: function () {
                    alert("Customer deleted successfully!");
                    loadCustomers();
                },
                error: function () {
                    alert("Error deleting customer!");
                }
            });
        }
    });
});
