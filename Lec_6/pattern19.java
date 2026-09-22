//       * 
//     * * * 
//   * * * * * 
// * * * * * * * 
//   * * * * * 
//     * * * 
//       * 

package Lec_6;

public class pattern19 {
    
    public static void main(String[] args) {

        int n=7;
        int star = 1;
        int row=0;
        int space=n/2;

        while(row<n){

            //! space
            int j=0;
            while (j<space) {
                System.out.print("  ");
                  j++;
            }
    
        //! star
            int i=0;
            while(i<star){
                System.out.print("* ");
                i++;
            }

            System.out.println();

            if (row<n/2){
                space--;
                star+=2;
            }
            else{
                space++;
                star-=2;
            }
            row++;
        }

    }
}
