import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un Valor");
            int a= sc.nextInt();

        System.out.println("Segundo Valor");
            int b= sc.nextInt();

        System.out.println("Tercer Valor");
            int c= sc.nextInt();

            if ( a>=b && a>=c) {
                if ( b >= c ){
                    System.out.println("Su orden seria " + a + ", " + b + ", " + c);
                } else if ( c >= b ) {
                    System.out.println("Su orden seria " + a + ", " + c + ", " + b );
                }

            } else if ( b>=a && b>=c) {
                if ( a>=c ) {
                    System.out.println("Su orden seria " + b + ", " + a + ", " + c);
                } else if ( c>=a ) {
                    System.out.println("Su orden seria " + b + ", " + c + ", " + a);
                }


            } else if ( c >= a && c >= b ) {
                if ( a >= b ) {
                    System.out.println("Su orden seria " + c + ", " + a + ", " + b);
                } else if ( b >= a ) {
                    System.out.println("Su orden seria " + c + ", " + b + ", " + a);
                }

            }

    }
}
