import java.util.Arrays;
import java.util.Scanner;

public class array12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a1q = {91, 52, 33, 14, 55, 66, 97, 28, 49,};

        System.out.println("array 12 com cambio de inversión");

        System.out.println("Desea invertirlo 1.si o 2.no");

        int ds = sc.nextInt();

        burbuja(a1q, ds);

    }

    public static void burbuja(int[] a1q, int ds) {
        for (int i = 0; i < a1q.length; i++) {
            for (int j = 0; j < a1q.length - 1 - i; j++) {
                if (ds == 1) {
                    if (a1q[j] < a1q[j + 1]) {
                        int temporal = a1q[j];
                        a1q[j] = a1q[j + 1];
                        a1q[j + 1] = temporal;
                    }
                }

                if (ds == 2) {
                    if (a1q[j] > a1q[j + 1]) {
                        int temporal = a1q[j];
                        a1q[j] = a1q[j + 1];
                        a1q[j + 1] = temporal;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a1q));
    }
}
