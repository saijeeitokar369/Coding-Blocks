package Homework;

//! Q9. Print the Multiplication Table of 7
public class ques9 {
    public static void main(String[] args) {
        int number = 7; // You can change this value to print the multiplication table of a different number

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
    
}
