//  
//                   0 
//                 9 0 9 
//               8 9 0 9 8 
//             7 8 9 0 9 8 7 
//           6 7 8 9 0 9 8 7 6 
//         5 6 7 8 9 0 9 8 7 6 5 
//       4 5 6 7 8 9 0 9 8 7 6 5 4 
//     3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 
//   2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 
// 1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1 

package Lec_8;

public class pattern33 {

     public static void main(String[] args) {
        
     int n = 10;
     int space = n-1;
     int star = 1;
     int num = 10;
     int row = 0;

     while (row<n) {

          //! space 
          int i = 0;
          while (i<space) {
               System.out.print("  ");
               i++;
          }

          int j = 0;
          while (j<star) {
               if (num==n) {
                    System.out.print("0 ");
               }
               else{
                    System.out.print(num+" ");
               }
               if (j<star/2) {
                    num++;
               }
               else {
                    num--;
               }

               j++;
          }
          

          //! next line
          System.out.println();
          space--;
          star+=2;
          row++;
     }

     }
    
}
