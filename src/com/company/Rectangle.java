package com.company;

public class Rectangle {


    private int lenght;
    private int height;
    protected double area = lenght * height;


// Create Constructor

    public Rectangle(int lenght, int height) {
        this.lenght = lenght;
        this.height = height;
        this.area = lenght * height;
    }

// Create Getters and Setters


    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
