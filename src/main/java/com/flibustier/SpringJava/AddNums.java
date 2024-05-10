package com.flibustier.SpringJava;

import java.util.Scanner;

public class AddNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type it : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
    }
}
