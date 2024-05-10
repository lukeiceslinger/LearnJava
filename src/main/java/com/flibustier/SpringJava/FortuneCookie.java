package com.flibustier.SpringJava;

import java.util.Random;

public class FortuneCookie {

    static String[] fortunes = {"Chill and let others chill","Don't be a guy you would tell a guy to not be that guy.",
            "love is in the air, wear mask or something","Don't go around for something that will come around",
            "pick up and kill it","cookie out of fortune"};

    public static void main(String[] args){
        Random random = new Random();
        int i = random.nextInt(fortunes.length);

        System.out.println(fortunes[i]);

    }
}
