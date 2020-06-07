package com.company;

public class Floor {

    private boolean laminat;
    private boolean lenoleum;
    private boolean parket;
    private boolean insulatedFloor;
    private char dollar = '$';
    private double priceLaminatPerMeter2 = 120.15;
    private double priceLenoleumPerMeter2 = 100.24;
    private double priceParketPerMeter2 = 230.73;
    private double priceInsulatedFloorPerMeter2 = 500.00;

//Create Constructor
    public Floor(boolean laminat, boolean lenoleum, boolean parket,
                 boolean insulatedFloor, char dollar, double priceLaminatPerMeter2,
                 double priceLenoleumPerMeter2, double priceParketPerMeter2,
                 double priceInsulatedFloorPerMeter2) {

        this.laminat = laminat;
        this.lenoleum = lenoleum;
        this.parket = parket;
        this.insulatedFloor = insulatedFloor;
        this.dollar = dollar;
        this.priceLaminatPerMeter2 = priceLaminatPerMeter2;
        this.priceLenoleumPerMeter2 = priceLenoleumPerMeter2;
        this.priceParketPerMeter2 = priceParketPerMeter2;
        this.priceInsulatedFloorPerMeter2 = priceInsulatedFloorPerMeter2;
    }

    public boolean isLaminat() {                                            //Laminat
        return laminat;

    }

    public void setLaminat(boolean laminat) {
        this.laminat = laminat;




    }
    // ______________________________________________________________________________________________________

    public boolean isLenoleum() {                                           //Lenoleum
        return lenoleum;
        if(this.)
    }

    public void setLenoleum(boolean lenoleum) {
        this.lenoleum = lenoleum;
    }

    //________________________________________________________________________________________________________
    public boolean isParket() {                                             //Parket
        return parket;
    }

    public void setParket(boolean parket) {
        this.parket = parket;
    }
    //_________________________________________________________________________________________________________
    public boolean isInsulatedFloor() {                                     //InsulatedFloor (обогрев пола)
        return insulatedFloor;
    }

    public void setInsulatedFloor(boolean insulatedFloor) {
        this.insulatedFloor = insulatedFloor;
    }
    //_________________________________________________________________________________________________________
    public char getDollar() {                                               //Simbol $
        return dollar;
    }

    public void setDollar(char dollar) {
        this.dollar = dollar;
    }
    //__________________________________________________________________________________________________________
    public double getPriceLaminatPerMeter2() {                               //Price Laminat Per Meter2
        return priceLaminatPerMeter2;
    }

    public void setPriceLaminatPerMeter2(double priceLaminatPerMeter2) {
        this.priceLaminatPerMeter2 = priceLaminatPerMeter2;
    }
    //__________________________________________________________________________________________________________
    public double getPriceLenoleumPerMeter2() {                              //Price Lenoleum Per Meter2
        return priceLenoleumPerMeter2;
    }

    public void setPriceLenoleumPerMeter2(double priceLenoleumPerMeter2) {
        this.priceLenoleumPerMeter2 = priceLenoleumPerMeter2;
    }
    //___________________________________________________________________________________________________________
    public double getPriceParketPerMeter2() {                               //Price Parket Per Meter2
        return priceParketPerMeter2;
    }

    public void setPriceParketPerMeter2(double priceParketPerMeter2) {
        this.priceParketPerMeter2 = priceParketPerMeter2;
    }
    //______________________________________________________________________________________________________________
    public double getPriceInsulatedFloorPerMeter2() {                          //Price Insulated Floor Per Meter2
        return priceInsulatedFloorPerMeter2;
    }

    public void setPriceInsulatedFloorPerMeter2(double priceInsulatedFloorPerMeter2) {
        this.priceInsulatedFloorPerMeter2 = priceInsulatedFloorPerMeter2;
    }


}
