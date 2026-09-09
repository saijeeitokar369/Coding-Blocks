package Lec_3;

public class ques {

    public static void main(String[] args) {

        int number= 210;

        if (number>=300 && number<= 460) {
            System.out.println("The prize is MacBook");
            if (number>=300 && number<=380) {
                System.out.println("Model:M1 Mac");
            } else {
                System.out.print("Model:M2 Mac");
            }
        }

        else if (number>=200 && number<= 280) {
            System.out.println("The prize is Kurkure");
            if (number>200 && number<280) {
                System.out.println("Chilli Kurkure");
            } else {
                System.out.println("Onion Kurkure");
            }
        }

        else if (number>=1100 && number<= 1500) {
            System.out.println("The prize is Cycle");
            if (number>=1100 && number<=1300) {
                System.out.println("Avon Cycle");
            } else {
                System.out.println("Hero Cycle");
            }
        }

       else if (number>50 && number<=80) {
            System.out.println("The prize is Bike");
            if (number>50 && number<65) {
                System.out.println("Bullet");
            } else {
                System.out.println("Rajdoot");
            }
        }

        else {
            System.out.println("Better luck next time");
        }

    }
    
}
