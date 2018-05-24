package com.ML;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Java HashMap Exercise
//HashMap
//Please watch this video first: https://www.youtube.com/watch?v=-JOSjIan2g0
//Enhanced For Loop
//https://www.youtube.com/watch?v=wHJR-bFPiqM

//Exercise
//Students are selecting a class president and you were were given the role to
//count up all the votes for each person. Create the logic for the method
//Tally votes that takes in an array of Strings and returns a HashMap of the occurrences
//of each vote per person. For example, out put should look
//similar to this {Carl : 4, John: 3}

        List<String> votes = Arrays.asList(
                "Ian", "Debra", "John", "Debra",
                "John", "Ian", "Debra", "Debra",
                "Debra", "John", "John", "Debra");
        System.out.println(tallyVotes(votes));
    }

        public static HashMap<String, Integer> tallyVotes(List<String> votes){
                //creating my HashMap object to be filled up and soon returned
                HashMap<String, Integer> talliedVotes = new HashMap<String, Integer>();

                for(int i = 0; i<votes.size();i++){
                    if(talliedVotes.containsKey(votes.get(i))){
                       talliedVotes.put(votes.get(i), talliedVotes.get(votes.get(i))+1 );
                    }
                    else{
                    talliedVotes.put(votes.get(i),1);
                    }
                }
                //return the results of my changed HashMap
                return talliedVotes;
            }
}
