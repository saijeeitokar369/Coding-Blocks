//       * 
//     *   * 
//   *       * 
// *           * 
//   *       * 
//     *   * 
//       * 

package Lec_6;

public class pattern20 {

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
                if (i==0 || i==star-1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                i++;
            }

            System.out.println();

            if (row<n/2){
                star +=2;
                space --;
            }
            else{
                star -=2;
                space ++;
            }
            row++;
        }
    }
}
