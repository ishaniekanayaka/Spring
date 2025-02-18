package lk.ijse.z13_spring_boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    private int code;
    private String itemName;
    private double price;
    private int qty;

    public Item() {
    }

    public Item(int code, String itemName, double price, int qty) {
        this.code = code;
        this.itemName = itemName;
        this.price = price;
        this.qty = qty;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
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
        return "Item{" +
                "code='" + code + '\'' +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
