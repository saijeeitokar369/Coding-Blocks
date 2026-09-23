// * * * * * 
//     * * * * 
//         * * * 
//             * * 
//                 * 


package Homework_1;

public class pattern7 {
    
    public static void main(String[] args) {
        int n=5;
        int space = 0;
        int star = n;
        int row = 0;
        while (row<n) {
            //! space
            int colspace = 0 ;
            while (colspace < space) {
                System.out.print("  ");
                colspace++;
            }
            //! star
            int colstar = 0;
            while (colstar < star) {
                System.out.print("* ");
                colstar++;
            }
            //! next line
            System.out.println();
            row++;
            space=space+2;
            star--;
        } 

    }
    
}
