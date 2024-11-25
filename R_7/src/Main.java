import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello world!");

        String Z = "*";

        int num1 = sc.nextInt();

        for (int x = 0; x < num1; x++) {
            for (int c = 0; c < num1; c++) {
                System.out.print(Z + " ");
            }
            System.out.println();

        }


    }
}