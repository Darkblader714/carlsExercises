package com.ML;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "12345678900987654321";
        String[] splStr = str.split("");
        ArrayList<int[]> output = new ArrayList<int[]>();
        int sum = 0;

        for (int i = 0; i<(splStr.length-5);i++) {
            int a = Integer.parseInt(splStr[i]);
            int b = Integer.parseInt(splStr[i+1]);
            int c = Integer.parseInt(splStr[i+2]);
            int d = Integer.parseInt(splStr[i+3]);
            int e = Integer.parseInt(splStr[i+4]);

            int sumFive = a + b + c + d + e;

            if(sumFive==sum) {

                int[] anotherConsecutiveNumbers = new int[5];
                anotherConsecutiveNumbers[0] = a;
                anotherConsecutiveNumbers[1] = b;
                anotherConsecutiveNumbers[2] = c;
                anotherConsecutiveNumbers[3] = d;
                anotherConsecutiveNumbers[4] = e;

                output.add(anotherConsecutiveNumbers);
            }

            else if (sumFive>sum){
                output.clear();
                sum = sumFive;

                int[] consecutiveNumbers = new int[5];
                consecutiveNumbers[0]=a;
                consecutiveNumbers[1]=b;
                consecutiveNumbers[2]=c;
                consecutiveNumbers[3]=d;
                consecutiveNumbers[4]=e;

                output.add(consecutiveNumbers);
            }
        }

        System.out.println("sum = " + sum);
        for (int i=0;i<output.size();i++) {
            for (int j:output.get(i)){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}