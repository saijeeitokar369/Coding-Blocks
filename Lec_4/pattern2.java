package Lec_4;

public class pattern2 {
    
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 0;
        while (row < n) {

            int col = 0;
            while (col < star) {
                System.out.print("* ");
                col++;

            }
            System.out.println();
            row++;
            star++;
        }
    }
    
}
