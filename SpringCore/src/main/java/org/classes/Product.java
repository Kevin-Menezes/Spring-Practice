package org.classes;

public class Product
{
    private int productId;
    private String productName;
    private Noodles n;
    private Chicken c;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Noodles getN() {
        return n;
    }

    public void setN(Noodles n) {
        this.n = n;
    }

    public Chicken getC() {
        return c;
    }

    public void setC(Chicken c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", n=" + n +
                ", c=" + c +
                '}';
    }
}
