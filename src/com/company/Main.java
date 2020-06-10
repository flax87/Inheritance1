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

public class Main {

    public static void main(String[] args) {
        Floor floor1 = new Floor(false, true,
                false, true, 20.00,
                30.00, 40.00,
                50.00);

        int priceLaminat1 = (int) floor1.priceForLaminat(10, 20);
        int priceLenolium1 = (int) floor1.priceForLenoleum(10, 30);
        int priceParket1 = (int) floor1.priceForParket(10, 40);
        System.out.println("Ціна замовлення становить - " + priceLaminat1 + priceLenolium1 + priceParket1 + "$");




    }


}
