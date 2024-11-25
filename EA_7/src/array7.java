import java.util.Random;

public class array7 {
    public static void main(String[] args) {
        int[] array = new int[100];
        inicializaArrayAleatorio(array);
        if (contieneElemento(array, 10)){
            System.out.println(" el numero 10 esta en el arrays");
        }else {
            System.out.println(" el numero no esta en el arrays");
        }
    }


    private static boolean contieneElemento(int[] array, int num) {
        boolean encontrado = false;

        for (int i = 0; i < array.length && !encontrado; i++) {
            if (array[i] == num) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    private static void inicializaArrayAleatorio(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

}
