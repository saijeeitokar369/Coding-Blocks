//                    1
//                2   2   2
//            3   3   3   3   3
//        4   4   4   4   4   4   4
//    5   5   5   5   5   5   5   5   5

package Homework_1;

public class pattern24 {
    public static void main(String[] args) {

        int n=5;
        int space = n-1;
        int star = 1;
        int row = 1;
        while (row<=n) {
            //! space
            int colspace = 0 ;
            while (colspace < space) {
                System.out.print("    ");
                colspace++;
            }
            //! star
            int colstar = 0;
            while (colstar < star) {
                System.out.print("   "+row);
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
