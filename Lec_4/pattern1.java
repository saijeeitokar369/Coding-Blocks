package Lec_4;

public class pattern1 {
    
    public static void main(String[] args) {
        int n = 5;
        int row = 0;

        while (row < n) {

            int col = 0;
            while (col < n) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;

        }
    }
    
}
