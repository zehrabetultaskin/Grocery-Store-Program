package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
	    double pearPrice, applePrice, tomatoPrice, bananaPrice, eggplantPrice, totalAmount;
        pearPrice=2.14;
        applePrice=3.67;
        tomatoPrice=1.11;
        bananaPrice=0.95;
        eggplantPrice=5.00;
        System.out.print("How many kilograms a pear? :");
        double pear=input.nextDouble();
        pearPrice=pear*pearPrice;
        System.out.print("How many kilograms a apple? :");
        double apple=input.nextDouble();
        applePrice=apple*applePrice;
        System.out.print("How many kilograms a tomato? :");
        double tomato=input.nextDouble();
        tomatoPrice=tomato*tomatoPrice;
        System.out.print("How many kilograms a banana? :");
        double banana=input.nextDouble();
        bananaPrice=banana*bananaPrice;
        System.out.print("How many kilograms a eggplant? :");
        double eggplant=input.nextDouble();
        eggplantPrice=eggplant*eggplantPrice;
        totalAmount=pearPrice+applePrice+tomatoPrice+bananaPrice+eggplantPrice;
        System.out.println("Total Amount: "+totalAmount);
    }
}
