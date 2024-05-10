package com.flibustier.SpringJava;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class MagicEightBall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your Question : ");
        String question = sc.nextLine();

        Random num = new Random();

        int randNum = num.nextInt(5);


        if(randNum == 0){
            System.out.println("Please enter something first");
        }else if(randNum == 1){
            System.out.println("Bro chill out!");
        } else if (randNum == 2) {
            System.out.println("Bruh just do something");
        } else if (randNum == 3) {
            System.out.println("Bruv? the hell?");
        } else {
            System.out.println("This is it bro!");
        }

    }
}
