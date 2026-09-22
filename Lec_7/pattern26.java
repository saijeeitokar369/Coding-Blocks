 
//                   1
//               1   2   3
//           1   2   3   4   5
//       1   2   3   4   5   6   7
//   1   2   3   4   5   6   7   8   9

package Lec_7;

public class pattern26 {

    public static void main(String[] args) {

        int n=5;
        int space = n-1;
        int star = 1;
        int row = 0;
        while (row<n) {
            //! space
            int colspace = 0 ;
            while (colspace < space) {
                System.out.print("    ");
                colspace++;
            }
            //! star
            int k=1;
            int colstar = 0;
            while (colstar < star) {
                if (k<n/2) {
                    System.out.print("   "+k);
                }
                else{
                    System.out.print("  "+k);
                }
                colstar++;
                k++;
            }
            //! next line
            System.out.println();
            row++;
            space--;
            star=star+2;
        } 

    }
    
}
