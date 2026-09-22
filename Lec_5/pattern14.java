package Lec_5;

public class pattern14 {

    public static void main(String[] args) {

        int n = 5;
        int row = 0;
        int star = 1;
        int space = n-1;
        while (row < 2*n-1) {
            //! space
            int i=0;
            while (i<space) {
                System.out.print("  ");
                i++;
            }
            //! print star 
             int j = 0;
             while (j<star) {
                System.out.print("* ");
                j++;
             }
            System.out.println();
            row++;
           
            if (row<n) {
                space--;
                star++;
            }
            else{
                space++;
                star--;
            }
            
        }
        
    }
    
}

