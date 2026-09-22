package Lec_4;

public class pattern5 {

    public static void main(String[] args) {
        int n = 5;
        int row = 0;

        while (row < n) {

            int col = 0;
            while (col < n) {
                if (col == 0 || col == n - 1 || row == 0 || row == n - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
                col++;
            }
            System.out.println(" ");
            row++;

        }
    }
}
