package Homework;
//! Q12. Find the Sum of Digits of a Given Number Using a Loop
public class ques12 {
    
    public static void main(String[] args) {
        int number = 12345; // You can change this value to find the sum of digits of a different number
        int sum = 0;

        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit from number
        }

        System.out.println("Sum of digits is: " + sum);
    }
}
