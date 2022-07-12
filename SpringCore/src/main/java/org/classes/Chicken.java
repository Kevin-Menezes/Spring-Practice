package org.classes;

import java.util.List;
import java.util.Map;

public class Chicken {

    private String Name;
    private Map<Integer,String> Ratings;
    private float Cost;

    public void setName(String name) {
        Name = name;
    }

    public void setRatings(Map<Integer, String> ratings) {
        Ratings = ratings;
    }

    public void setCost(float cost) {
        Cost = cost;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "Name='" + Name + '\'' +
                ", Ratings=" + Ratings +
                ", Cost=" + Cost +
                '}';
    }
}
