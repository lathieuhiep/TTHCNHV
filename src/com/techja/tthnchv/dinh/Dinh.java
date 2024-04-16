package com.techja.tthnchv.dinh;

public class Dinh {
    private double x, y;

    public Dinh(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void inTT() {
        System.out.println(x + "," + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
