import java.util.Arrays;
import java.util.Random;

public class array11 {}

/*
        int[] array1 = {1, 2, 2, 4};
        int[] array2 = {7, 2, 4, 2};

        int[] array3 = elementosComunes(array1, array2);
        System.out.println(Arrays.toString(array3));
    }

    public static int[] elementosComunes(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length];
        int elementosArray3 = 0;

        for (int i = 0; i < array1.length; i++) {
            if (buscarElemento(array2, array1[i]) && !buscarElemento(array3, array1[i])){
                array3[elementosArray3] = array1[i];
                elementosArray3++;
            }
        }

        int[] arrayTamExacto = new int[elementosArray3];

        for (int i = 0; i < elementosArray3; i++) {
            arrayTamExacto[i] = array3[i];
        }

        return arrayTamExacto;
    }

    public static boolean buscarElemento(int[] array, int elem){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem)
                return true;
        }
        return false;
    }
}

/*
    public static void main(String[] args) {

        int[] a1q = {1,2,4,5,9};

        int[] a2q = {1,2,8,6,0};

        int[] a3q = comparadordeiguales( a1q, a2q);

        System.out.println(Arrays.toString(a3q));


    }

    private static int[] comparadordeiguales(int[] array1, int [] array2) {
        int [] array 3 = new int [array1.length];
        int comparadorArray3= 0;

        for (int i = 0; i < array1.length; i++){
            if (buscarElemento(array2, array1[i])){

            }
        }

    }

    private static boolean buscarElemento (int[] array) {

    }

}
*/
 