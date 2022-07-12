package org.constructor;

public class Mobile
{
    private String name;
    private String company;
    private int cost;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    // Constructors
    public Mobile() { // Default constructor needs to be added everytime
    }

    public Mobile(String name, String company, int cost) {
        this.name = name;
        this.company = company;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", cost=" + cost +
                '}';
    }
}
