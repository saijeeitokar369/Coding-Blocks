//                    1
//                2   3   4
//            5   6   7   8   9
//       10  11  12  13  14  15  16
//   17  18  19  20  21  22  23  24  25

package Homework_1;

public class pattern25 {
    public static void main(String[] args) {

        int n=5;
        int space = n-1;
        int star = 1;
        int row = 0;
        int k=1;
        while (row<n) {
            //! space
            int colspace = 0 ;
            while (colspace < space) {
                System.out.print("    ");
                colspace++;
            }
            //! star
            int colstar = 0;
            while (colstar < star) {
                if (k<10) {
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
