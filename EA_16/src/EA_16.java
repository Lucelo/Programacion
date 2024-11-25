import java.util.Arrays;
import java.util.Scanner;

public class EA_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello world!");
        int val1 = sc.nextInt();

        int [][] matriz = new int [val1][10];

        multiplicacion(matriz, val1 );

        for (int[] ints : matriz) {
            
            System.out.println(Arrays.toString(ints));

        }
    }

    public static void multiplicacion(int [][] matriz, int val1) {
        int val3 = 0;

        for (int i = 0; i < val1; i++) {
            val3++;

            int val2 = 1;
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = val3 * val2;
                val2++;
            }
        }
    }
}