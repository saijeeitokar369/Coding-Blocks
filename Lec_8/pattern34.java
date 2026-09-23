package Lec_8;

public class pattern34 {
    
    public static void main(String[] args) {

        int row = 0;
        int n = 7;
        int star= n;
        int num = 1;

        while (row<n) {
            //! star 
            int j = 0;
            while (j<star) {
                System.out.print(num+" ");
                j++;
            }

            //! next line 
            System.out.println();
            row++;
            
        }
    }

}
