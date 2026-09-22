// 
//                    1
//                1   2   1
//            1   2   3   2   1
//        1   2   3   4   3   2   1
//    1   2   3   4   5   4   3   2   1

package Lec_7;

public class pattern27 {

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
                System.out.print("   "+k);
                if (colstar<star/2) {
                    k++;
                }
                else{
                    k--;
                }
                colstar++;
        
            }
            //! next line
            System.out.println();
            row++;
            space--;
            star=star+2;
        } 

    }
    
}
