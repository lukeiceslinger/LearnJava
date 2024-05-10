package com.flibustier.SpringJava;

public class Lottery {
    public static void main(String[] args){
        int[][] lotteryScratcher = {{20,40,24},
                                    {30,13,14},
                                    {65,23,76}
        };

        System.out.println(lotteryScratcher[1][2]);


        for(int i = 0; i <3 ; i++){
            System.out.println(lotteryScratcher[i][i]);
        }
    }
}
