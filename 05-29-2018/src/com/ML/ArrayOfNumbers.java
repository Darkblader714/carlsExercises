package com.ML;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class ArrayOfNumbers{
    public static void main(String [] args){
        //Due end of Wednesday

        //given a string word
        //I want you to convert that word into an ArrayList of Integers
        //of each of those characters ascii values.

        //What is an ascii table? https://www.asciitable.com/
        //VIDEO : https://www.youtube.com/watch?v=zB85kTs-sEw


        //create logic static method called convertToNum that takes in a String
        //as parameter and returns an ArrayList of numbers with results below

        System.out.println(convertToNum("Aaron")); //returns [65, 97, 114, 111, 110]
        System.out.println(convertToNum("Carl")); //returns [67, 97, 114, 108]
        System.out.println(convertToNum("Ted")); //returns [84, 101, 100]
        System.out.println(convertToNum("ooo")); //returns [111, 111, 111]

    }

    public static List<Integer> convertToNum(String str){
        //logic goes here
//        String[] splStr = str.split(", ");
        char[] splStr = str.toCharArray();
        System.out.println(splStr);

       HashMap<Character, Integer> asciiUpperConversion = new HashMap<Character, Integer>(25);
       HashMap<Character, Integer> asciiLowerConversion = new HashMap<Character, Integer>(25);

       ArrayList<Integer> strToAscii = new ArrayList<Integer>();

//        for(char i ='A'; i<='Z'; i++){
//            for(int j = 0; j<=25;j++)
//                asciiUpperConversion.put(i,j+65);
//        }
//        System.out.println(asciiUpperConversion);
//
//        for(char k ='a'; k<='z'; k++){
//            for(int l = 0; l<=25;l++)
//                asciiLowerConversion.put(k,l+97);
//        }
//        System.out.println(asciiLowerConversion);
//
//// Basically, after being changed to a character array,
//        //for each element of the array,
//        //if the letter is upper case and if the Upper case hashmap contains that letter as one of its keys,
//        //then it's supposed to add the corresponding value to the strToAscii ArrayList
//
//        for(int m=0; m<splStr.length;m++){
//            if(Character.isUpperCase(splStr[m])&& asciiUpperConversion.containsKey(splStr[m])){
//                strToAscii.add(asciiUpperConversion.get(m));
//
//            }
//            else if(Character.isLowerCase(splStr[m])&& asciiLowerConversion.containsKey(splStr[m])){
//                strToAscii.add(asciiLowerConversion.get(m));
//            }
//
//        }
        for (char c: str.toCharArray()){
            strToAscii.add((int) c);
        }
        return strToAscii;
    }
}