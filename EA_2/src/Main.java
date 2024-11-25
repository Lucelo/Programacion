/*Crea un programa que detecte cuántos números negativos hay en un array de
enteros*/

public class Main {

    public static void main(String[] args) {

        int [] numero = {2,-2,3,4,6,78,-33,23,-654,-332,52,-34,-42,425,-74,62,-678,24,2,-6,8,43,-7,26};

        contadordenegativos(numero);

    }

    public static void contadordenegativos(int[] numero) {
        int contador = 0;

        for (int i : numero) {
            if (i < 0) {
                contador++;
            }
        }

        System.out.println("La cantidad de numeros negativos seria " + contador);

    }

}