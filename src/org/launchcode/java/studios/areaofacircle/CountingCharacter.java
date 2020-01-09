package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userString = input.nextLine();
        userString = userString.toLowerCase();


        char[] charArray = userString.toCharArray();
        HashMap<Character,Double> charMap = new HashMap<>();

        for(char c : charArray ) {
            if (!charMap.containsKey(c)) {
               if(Character.isAlphabetic(c)) {
                   charMap.put(c,1.0);
               }
            } else {
                charMap.put(c,charMap.get(c)+1);
            }
        }

        System.out.println(charMap);










    }
}
