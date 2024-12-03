import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] matriz1 = {3,1,3, 4, 5, 6, 7, 8};

        int [] matriz2 = {7,9,7, 6, 5, 4, 3, 2};

       int [] [] matrizsumada = sumadematriz(matriz1, matriz2);



    }

    public static void sumadematriz(int [] matriz1, int [] matriz2) {

        int [] [] matriz3 = new int [matriz1.length] [matriz1[0]];
        for (int i = 0 ; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i]; j++) {
                matriz3 [i] [j] = matriz1 [i][j] + matriz2 [i][j] ;

            }
            return matriz3;
        }

    }


}
