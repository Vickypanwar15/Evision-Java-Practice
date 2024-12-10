package com.nestedclass;

public class ShoppinCartInner {
    public void checkout(double totalAmount){
        class DiscountCalculator{
            public  double applyDiscount(double amount){
                if(amount>1000){
                    return amount * 0.9;
                }
                else{
                    return amount;
                }
            }
        }
        DiscountCalculator d  = new DiscountCalculator();
        double finalAmount = d.applyDiscount(totalAmount);

        System.out.println("FInal Amount is :"+finalAmount);
    }

    public static void main(String[] args) {
        ShoppinCartInner s = new ShoppinCartInner();
        s.checkout(1500);
    }
}
