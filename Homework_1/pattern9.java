//                    *   
//                *       *   
//            *       *       *   
//        *       *       *       *   
//    *       *       *       *       *  


package Homework_1;

public class pattern9 { {

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
            int colstar = 0;
            while (colstar < star) {
                System.out.print("    *   ");
                colstar++;
            }
            //! next line
            System.out.println();
            row++;
            space--;
            star++;
        } 

}
    
}
