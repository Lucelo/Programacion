/*Crea un programa que sume todas las posiciones pares de un array de enteros.*/

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int [] numeros = {4,234,42,34,34,65,23,78,677,556,34,2,567,57,4,676,68678,35,886,234,23,676,34,34,42};

        int suma = sumadeposicionesPares(numeros);

        System.out.println("La suma de las posiciones pares del array es: " + suma);

    }

    public static int sumadeposicionesPares(int [] numeros) {
        int suma = 0;


        for (int i = 0; i < numeros.length; i += 2) {
            suma += numeros[i];
        }

        return suma;
    }

}