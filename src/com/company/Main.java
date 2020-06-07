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
