/*
 * Inheritance1
 *
 * Oleksii Shevchenko KNUTE m1
 */

/*
 * Floor / Підлога
 *
 * 07.06.20
 *
 * Copyright Oleksii Shevchenko KNUTE gr 1m
 *
 * Module 2 task 2
 *
 *
                1. Create a child  from the class Rectangle.
                2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */

package com.company;

import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLenght() == rectangle.getLenght() &&
                getHeight() == rectangle.getHeight() &&
                Double.compare(rectangle.getArea(), getArea()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLenght(), getHeight(), getArea());
    }
}
