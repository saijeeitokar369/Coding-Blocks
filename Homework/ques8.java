package Homework;

//! Q8. Find the Sum of N Natural Numbers

public class ques8 {
    
    public static void main(String[] args) {
        int N = 10; // You can change this value to find the sum of a different number of natural numbers
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + N + " natural numbers is: " + sum);
    }
    
}
