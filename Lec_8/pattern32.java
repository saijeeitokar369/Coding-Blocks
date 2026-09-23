// 1  
// 2  *  2  
// 3  *  3  *  3  
// 4  *  4  *  4  *  4  
// 5  *  5  *  5  *  5  *  5  
// 4  *  4  *  4  *  4  
// 3  *  3  *  3  
// 2  *  2  
// 1  

package Lec_8;

public class pattern32 {

    public static void main(String[] args) {
       int n= 5;
       int star = 1;
       int row = 1;
       int num =1;

       while(row<=n*2-1){
        int i = 0;
        while(i<star){
            if(i%2==0){
                System.out.print(num+"  ");
            }else{
                System.out.print("*  ");
            }
            i++;
        }
        System.out.println();
        if(row<n){
            star+=2;
            num++;

        }else{
            star-=2;
            num--;
        }

        row++;
       }
       
}

}
