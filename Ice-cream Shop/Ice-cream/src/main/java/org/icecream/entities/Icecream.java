package org.icecream.entities;

public class Icecream {

    private int Id;
    private String Name;
    private String Category;
    private Float Price;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    public Icecream() {
    }

    public Icecream(int id, String name, String category, Float price) {
        Id = id;
        Name = name;
        Category = category;
        Price = price;
    }

    @Override
    public String toString() {
        return "Icecream{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Category='" + Category + '\'' +
                ", Price=" + Price +
                '}';
    }
}
