public class Main {

    private static int[][] matrizminas;
    private static boolean [][] matrizlevantadas;

    private static final int TAM_MATRIZ = 10;
    private static final int MINAS_A_PLANTAR = 10;
    private static final int MINA = -1;

    public static void main(String[] args) {

        generarMatrices(TAM_MATRIZ);
        // Ahora plantamos las minas
        
        plantarMinas(MINAS_A_PLANTAR);
        //Falta rellenar con los números

        visualizaTablero();
    }

    public static void generarMatrices(int tam){
        matrizminas = new int[tam][tam];
        matrizlevantadas = new boolean [tam][tam];
    }

    public static void plantarMinas(int numMinas){
        for (int i = 0; i < numMinas; i++) {
            int coordX = (int) (Math.random() * TAM_MATRIZ);
            int coordY = (int) (Math.random() * TAM_MATRIZ);

            if (matrizminas[coordX][coordY] != MINA){
                matrizminas[coordX][coordY] = MINA;
            }
            else {
                i--;
            }
        }
    }

    public static void visualizaTablero(){
        for (int i = 0; i < TAM_MATRIZ; i++) {
            for (int j = 0; j < TAM_MATRIZ; j++) {
                if (matrizlevantadas[i][j]){
                    // Muestro el contenido de la casilla de la matriz de minas
                    System.out.printf("%2d | ", matrizminas[i][j]);
                }
                else {
                    System.out.print(" [] ");
                }
            }
            System.out.println();
        }
    }
}