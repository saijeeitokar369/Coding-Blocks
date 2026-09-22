// * * * * * 
//     * * * * 
//         * * * 
//             * * 
//                 * 
//             * * 
//         * * * 
//     * * * * 
// * * * * * 

package Lec_5;

public class pattern15 {

    public static void main(String[] args) {

        int n = 5;

        //! Upper half
        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        //! Lower half
        for (int i = n - 2; i >= 0; i--) {

            // Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
