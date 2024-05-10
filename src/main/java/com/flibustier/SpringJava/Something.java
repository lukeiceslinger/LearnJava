package com.flibustier.SpringJava;

import java.util.ArrayList;

public class Something {

    static ArrayList<String> clowns = new ArrayList<>();
    static ArrayList<String> victims = new ArrayList<>();
    static ArrayList<String> heros = new ArrayList<>();



    public static void main(String[] args){


        victims.addFirst("Young Children");
        victims.add("Not so young children");
        victims.add("Man child");
        victims.add("Innocent couple");
        victims.add("Annoying adults");
        victims.addLast("Really old grandmas");

        heros.addFirst("Sam Winchester");
        heros.add("Dean Winchester");
        heros.add("John Winchester");
        heros.add("Angel Castial");
        heros.addLast("Luke IceSlinger");
    }

    public void getClowns(int i) {
        clowns.addFirst("Big ass clown");
        clowns.add("Scary clown");
        clowns.add("Small clown");
        clowns.add("\"Hell bent to kill you\" clown");
        clowns.add("\"Scaredy clown\"");
        clowns.addLast("Friendly clown");
    }
}