package lk.ijse.z13_spring_boot.dto;

public class ItemDTO {
    private int code;
    private String itemName;
    private double price;
    private int qty;

    public ItemDTO() {
    }

    public ItemDTO(int code, String itemName, double price, int qty) {
        this.code = code;
        this.itemName = itemName;
        this.price = price;
        this.qty = qty;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }



    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    @Override
    public String toString() {
        return "ItemDTO{" +
                "code='" + code + '\'' +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
