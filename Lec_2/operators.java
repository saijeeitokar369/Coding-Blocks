package Lec_2;

public class operators {
    public static void main(String[] var0){

        //! ARTHIMETIC OPERATOR

        int a = 20;
        int b = 45;
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        System.out.println(a++);   //! post-increment
        System.out.println(a);   
        System.out.println(++a);   //! pre-increment

        //! RELATIONAL OPERATOR

        System.out.println(a<=b);
        System.out.println(a<b);
        System.out.println(a!=b);
        System.out.println(a==b);

    }
}
