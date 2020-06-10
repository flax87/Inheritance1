package com.company;

public class Room extends Floor {


    int interior;
    int design;
    int height;
    int price;


    public Room(boolean laminat,
                boolean lenoleum,
                boolean parket,
                boolean insulatedFloor,
                double priceLaminatPerMeter2,
                double priceLenoleumPerMeter2,
                double priceParketPerMeter2,
                double priceInsulatedFloorPerMeter2,
                int interior, int design, int height, int price) {
        super(laminat, lenoleum, parket,
                insulatedFloor, priceLaminatPerMeter2,
                priceLenoleumPerMeter2, priceParketPerMeter2,
                priceInsulatedFloorPerMeter2);

        this.interior = interior;
        this.design = design;
        this.height = height;
        this.price = price;
    }

    public int getInterior() {
        return interior;
    }

    public void setInterior(int interior) {
        this.interior = interior;
    }

    public int getDesign() {
        return design;
    }

    public void setDesign(int design) {
        this.design = design;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "interior=" + interior +
                ", design=" + design +
                ", height=" + height +
                ", price=" + price +
                '}';
    }
}



