package com.flibustier.SpringJava;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args){

        Random dice = new Random();
        int x = dice.nextInt(6) + 1;

        System.out.println("dice says, \"Move "+ x +" spaces\"");
    }
}
