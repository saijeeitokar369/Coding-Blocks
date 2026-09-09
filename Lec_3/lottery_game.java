package Lec_3;

public class lottery_game {

    public static void main(String[] args){
        int number= 700;

        if (number>=300 && number<= 460) {
            System.out.println("The prize is MacBook");
        }

        else if (number>=200 && number<= 280) {
            System.out.println("The prize is Kurkure");
        }

        else if (number>=1100 && number<= 1500) {
            System.out.println("The prize is Cycle");
        }

       else if (number>50 && number<=80) {
            System.out.println("The prize is Bike");
        }

        else {
            System.out.println("Better luck next time");
        }

    }
    
}
