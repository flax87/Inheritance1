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

public class Floor extends Rectangle {

    private boolean laminat = true;                                     //
    private boolean lenoleum = true;
    private boolean parket = true;
    private double priceLaminatPerMeter2;
    private double priceLenoleumPerMeter2;
    private double priceParketPerMeter2;


    //empty constructor
    public Floor() {
        super(0, 0);

    }


    //Create Constructor
    public Floor(boolean laminat, boolean lenoleum, boolean parket,
                 boolean insulatedFloor, double priceLaminatPerMeter2,
                 double priceLenoleumPerMeter2, double priceParketPerMeter2,
                 double priceInsulatedFloorPerMeter2) {


        //Super

        super(4, 5);


        this.laminat = laminat;
        this.lenoleum = lenoleum;
        this.parket = parket;


        this.priceLaminatPerMeter2 = priceLaminatPerMeter2;
        this.priceLenoleumPerMeter2 = priceLenoleumPerMeter2;
        this.priceParketPerMeter2 = priceParketPerMeter2;

    }

    public boolean isLaminat() {
        return laminat;

    }

    public void setLaminat(boolean laminat) {
        this.laminat = laminat;


    }
    // ______________________________________________________________________________________________________

    public boolean isLenoleum() {                                           //Lenoleum
        return true;
    }

    public void setLenoleum(boolean lenoleum) {
        this.lenoleum = lenoleum;
    }


    public boolean isParket() {                                             //Parket
        return parket;
    }

    public void setParket(boolean parket) {
        this.parket = parket;
    }


    public double getPriceLaminatPerMeter2() {                               //Price Laminat Per Meter2
        return priceLaminatPerMeter2;
    }

    public void setPriceLaminatPerMeter2(double priceLaminatPerMeter2) {
        this.priceLaminatPerMeter2 = priceLaminatPerMeter2;
    }

    public double getPriceLenoleumPerMeter2() {                              //Price Lenoleum Per Meter2
        return priceLenoleumPerMeter2;
    }

    public void setPriceLenoleumPerMeter2(double priceLenoleumPerMeter2) {
        this.priceLenoleumPerMeter2 = priceLenoleumPerMeter2;
    }


    public double getPriceParketPerMeter2() {                               //Price Parket Per Meter2
        return priceParketPerMeter2;
    }

    public void setPriceParketPerMeter2(double priceParketPerMeter2) {
        this.priceParketPerMeter2 = priceParketPerMeter2;
    }



    //----------------------------------------------------------------------------------------------------------------
    //Методи, що рахують суму товару за метр квадратний
    double True4 = 0;

    public double priceForLaminat(double area, double priceLaminatPerMeter2) {
        double True1 = 0;
        if (laminat == true ) {                                  //True1,2,3,4 - йдуть як результат
            True1 = area * priceLaminatPerMeter2 + this.True4;

        } else System.out.println("Ламінат не замовлено");
        return True1;
    }

    public double priceForLenoleum(double area, double priceLenoleumPerMeter2) {
        double True2 = 0;
        if (lenoleum == true) {
            True2 = area * priceLenoleumPerMeter2 + this.True4;

        } else System.out.println("Лінолеум не замовлено");
        return True2;
    }

    public double priceForParket(double area, double priceParketPerMeter2) {
        double True3 = 0;
        if (parket == true) {
            True3 = area * priceParketPerMeter2 + this.True4;

        } else System.out.println("Паркет не замовлено");
        return True3;
    }


//----------------------------------------------------------------------------------------------------------------
    //toString


    @Override
    public String toString() {
        return "Floor{ " +
                "Ламінат = " + this.laminat +
                ", Лінолеум = " + lenoleum +
                ", Паркет = " + parket +
                ", Ціна ламінату на м.кв = " + priceLaminatPerMeter2 +
                ", Ціна лінолеуму на м.кв  = " + priceLenoleumPerMeter2 +
                ", Ціна паркету на м.кв = " + priceParketPerMeter2 +
                '}';
    }
}
