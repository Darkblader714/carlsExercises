package com.ML;

import java.util.HashMap;
import java.util.Map;

public class FindAverage {
    
    public static void main(String [] args) {

        FindAverage.Student carl = new Student("Carl Bevere", 25);
        carl.addBooks("Green Eggs and Ham", 20);
        carl.addBooks("War and Peace", 1225);
        carl.addBooks("Game of thrones", 694);

        FindAverage.Student ted = new FindAverage.Student("Ted Ytienne", 24);
        ted.addBooks("The Hobbit", 304);
        ted.addBooks("Life of Pi", 354);
        ted.addBooks("A Feast for Crows", 753);

        FindAverage.Student nerine = new FindAverage.Student("Neriene Tarper", 23);
        nerine.addBooks("The Two Towers", 415);
        nerine.addBooks("War and Peace", 1225);
        nerine.addBooks("A Storm of Swords", 973);

        FindAverage.Student[] studentArray = {carl, ted, nerine};

        System.out.println(averagePages(studentArray));
    }

    public static double averagePages(FindAverage.Student[] students) {

        //how would you get the average number of all the books of all the students?
        //for example: theres 5 students, each have 2 books:  totalNumber of pages of all students / totalNumber of books of all students
        //write your logic in here
        //please message me if you need help
        int avgpg = 0;

        for(int i = 0; i<students.length; i++){
//            for(int j=0; j<students[i].)
            avgpg += students[i].totalPages();
        }

        double average = avgpg/students.length;

        return average; //replace this 0 with a variable called average

    }

    public class Student {

        int age;
        String name;
        Map<String, Integer> books = new HashMap<String, Integer>();

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void addBooks(String bookName, int bookPages) {
            this.books.put(bookName, bookPages);
        }

        public int totalPages() {

            //How would you get the total number of pages a student has of all of their books?
            //write your logic in here
            //please message me if you need help

            int sum = 0;

            for (Map.Entry<String, Integer> bkpg : books.entrySet()) {
                sum += bkpg.getValue();
            }
            return sum; //replace this 0 with a variable called sum
        }
    }



}
