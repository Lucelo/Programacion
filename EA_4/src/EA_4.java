import java.util.Arrays;

public class EA_4 {
   static final int Numero = 6000;



    public static void main(String[] args) {
        int[] numAleatorio = new int[Numero];
        rellenar(numAleatorio);

        numeroTerminacionMax(numAleatorio);


    }

     public static void rellenar(int[] Array) {
         for (int i = 0; i < Array.length; i++) {
             Array[i] = (int) (Math.random() * 101);
         }

     }

    public static void numeroTerminacionMax(int[] array) {
        int[] repeticionTerminaciones = new int[10];

        for (int i = 0; i < array.length; i++) {
            int digitoTermina = array[i] % 10;
            repeticionTerminaciones[digitoTermina]++;
        }

        System.out.println(Arrays.toString(repeticionTerminaciones));
    }

}