package Homework;

//! Q4. Find Maximum of Two Numbers

public class ques4 {
    public static void main(String[] args) {
        int num1 = 15; // First number
        int num2 = 25; // Second number

        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the maximum number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
