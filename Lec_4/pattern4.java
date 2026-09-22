package Lec_4;

public class pattern4 {
    
    public static void main(String[] args) {
        int n = 5;
        int space = n - 1;
        int star = 1;
        int row = 0;

        while (row < n) {

            int i = 0;
            while (i < space) {
                System.out.print("   ");
                i++;
            }
            int j = 0;
            while (j < star) {
                System.out.print("*  ");
                j++;

            }
            System.out.println();
            row++;
            space--;
            star++;
        }
    }
    
}
