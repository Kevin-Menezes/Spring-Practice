package org.cars;

public class Cars
{
    private String carName;
    private String carColor;
    private int carHp;

    // Setters
    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setCarHp(int carHp) {
        this.carHp = carHp;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carHp=" + carHp +
                '}';
    }
}
