package org.supermarket.entities;

public class Items {

    private int itemId;
    private String itemName;
    private float itemPrice;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    // Default constructor
    public Items() {
    }

    public Items(int itemId, String itemName, float itemPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
