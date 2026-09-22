// * * * * * * * 
// * * *   * * * 
// * *       * * 
// *           * 
// * *       * * 
// * * *   * * * 
// * * * * * * * 

package Lec_6;
public class pattern18 {
    
    public static void main(String[] args) {

        int n=9;
        int star = n/2+1;
        int row=0;
        int space=-1;

        while(row<n){
        //! star
            int i=0;
            while(i<star){
                System.out.print("* ");
                i++;
            }

        //! space
            int j=0;
            while (j<space) {
                System.out.print("  ");
                  j++;
            }
    
        //! star
            int k=0;
            if (row == 0 || row == n-1) {
                k =1;
            }
            while (k<star) {
                System.out.print("* ");
                 k++;
            }

            System.out.println();

            if (row<n/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            row++;
        }
    }
}
