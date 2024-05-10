package com.flibustier.SpringJava;

import java.util.Scanner;

public class PokemonParty {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What pokemon are you thinking of? : ");
        String poki = sc.nextLine();

        System.out.println("What pokemon are you thinking of? : ");
        String poki1 = sc.nextLine();

        System.out.println("What pokemon are you thinking of? : ");
        String poki2 = sc.nextLine();


        System.out.println("Your party pokemons : "+poki+" "+poki1+" & "+poki2);

    }
}
