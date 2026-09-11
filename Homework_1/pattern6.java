
// *        *  
//   *   *     
//     *       
//   *   *     
// *        *

package Homework_1;

public class pattern6 {

    public static void main(String[] args) {
        
         int n=5;
        int i=0;//! row
        while(i<n){
                //! star
                int j = 0;//! col
                while (j<n) {
                    if (j==i || i+j==n-1) {
                        System.out.print(" * ");
                    }
                    else{
                    System.out.print("   ");
                    }
                    j++;    
                }
                //! next line
                System.out.println(" ");
                i++;}    
    
    }
}
  