package com.amigoscode;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String [] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";




        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "Yellow";
        System.out.println(Arrays.toString(colors));

        int [] numbers = {100, 200};

        for (int i= colors.length -1; i >=0; i--){
            System.out.println(colors[i]);
          }
        System.out.println(colors.length);

        for (String color: colors){
            System.out.println(colors);
        }
        Arrays.stream(colors).forEach(System.out::println);
    }

}
