package Lec_4;

public class pattern3 {
    
    public static void main(String[] args) {
        int n = 6;
        int star = 5;
        int row = 0;
        while (row < n) {

            int col = 0;
            while (col < star) {
                System.out.print("* ");
                col++;

            }
            System.out.println();
            row++;
            star--;
        }
    }
    
}
