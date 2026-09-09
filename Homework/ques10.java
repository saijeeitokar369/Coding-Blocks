package Homework;

//! Q10. Find the Factorial of a Number
public class ques10 {
    public static void main(String[] args) {    
        int number = 5; // You can change this value to find the factorial of a different number
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
