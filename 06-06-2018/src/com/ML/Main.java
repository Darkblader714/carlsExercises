package com.ML;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        File numbers = new File("C:\\Users\\syntel\\Desktop\\carlsExercises\\06-06-2018\\numbers.txt");
        BigInteger num = BigInteger.ZERO;
        try (BufferedReader br = new BufferedReader(new FileReader(numbers))) {
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                char[] sCL = sCurrentLine.toCharArray();
                for(int i=0; i<sCL.length;i++){
                    int nSCL = Character.getNumericValue(sCL[i]);
                    BigInteger bSCL = BigInteger.valueOf(nSCL);
                    System.out.println(num=num.add(bSCL));
                }
            }
        }
        catch (IOException e){
        System.out.println("Nope");
        }
    }
}
