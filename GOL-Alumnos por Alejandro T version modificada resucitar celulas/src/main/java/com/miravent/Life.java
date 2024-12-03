/*
Creado Por Alejandro Toscano Rufo

Ha sido de los ejercicios que más tiempo he tardado esto ha sido hecho a base de tomar códigos que me he encontrado
por internet, videos y tres cafes espero que le funcione a mí no me ha ido el maven a sí que ha sido como andar en una
cueva a oscuras, espero que el próximo día podamos ver los errores, ya que he tenido que estar hasta las 2 de la noche
 */


package com.miravent;

import java.util.Random;

public class Life {

    //Establece la matriz
    private static boolean[][] grid;

    //Establece la cantidad de población
    private static int population;

    //Establece la generacion dentro del juego
    private static int generation;

    // Se usa como una segunda matriz para modificar la primera
    private static boolean[][] cicloGrid;

    //Establece varios parametros necesarios para que se ejecute el juego
    public static void inicializa (int NUM_CELDAS_A, int NUM_CELDAS_B) {

        grid = new boolean[NUM_CELDAS_A][NUM_CELDAS_B];

        cicloGrid = new boolean[NUM_CELDAS_A][NUM_CELDAS_A];

        generation = 0;

        population = 0;

    }


    //Establece las bases para que el ejercicio se active
    public static void fillRandom() {

        //Establece un metodo random para determinar el principio
        Random gente = new Random();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = gente.nextBoolean();
                if (grid[i][j]) {

                    population++;

                }

            }

        }

    }

    //Cuenta la cantidad de casillas vivas
    public static int contarVecinos(int i, int j) {

        //
        int nVecinos = 0;

        for (int k = i-1; k <= i+1; k++) {
            for (int l = j-1; l <= j+1; l++) {
                if (k >= 0 && k < grid.length && l >= 0 && l < grid[0].length){
                    if ((l!=j || k!=i) && grid[k][l]){
                        nVecinos++;
                    }
                }
            }
        }


        return nVecinos;
    }

    // Carcula si soble viven o se mueren las casillas
    public static void siguienteGeneracion() {

        population = 0;

        //Siendo sinceros esto lo medio saque del jardin pero use parte del codigo
        //de una persona de overflow por que no se me ocurrio del todo como hacerlo

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                int mvecinos = contarVecinos(i, j);

                cicloGrid[i][j] = (grid[i][j] && (mvecinos == 2 || mvecinos == 3)) || (!grid[i][j] && mvecinos == 3);

                //Modificación de las celulas tienen que vorvel

                //Esta resucita en base a 1 entre 1000
                if ((!grid[i][j] && mvecinos == 1) && Math.random() <= 0.005) {

                    cicloGrid[i][j] = true;

                    // Tuve que usar dos int para evitar que este no explotara
                    for (int n = Math.max(0, i - 1); n <= Math.min(grid.length - 1, i + 1); n++) {

                        for (int m = Math.max(0, j - 1); m <= Math.min(grid[0].length - 1, j + 1); m++) {

                            //Esta lo hara en base a 1 entre 4
                            if ((!grid[i][j] && mvecinos == 1) && Math.random() <= 0.005) {

                                cicloGrid[i][j] = true;

                            }
                        }
                    }
                }

                //Suma a la población

                if (cicloGrid[i][j]) {
                    population++;
                }

            }
        }



        //No se del todo que hace esto pero esta parte tambien fue del codigo de una persona y me sirve
        boolean[][] temp = grid;

        grid = cicloGrid;

        cicloGrid = temp;

        generation++;

    }

    // Todo lo de aqui fue hecho a base de videos de youtube y codigo
    // que sinceramente no entiendo mucho pero se que funciona pero sinceramente no se porque
    public static void init() {
        fillRandom();
        generation = 0;
    }

    public static void tick() {
        siguienteGeneracion();
    }

    public static boolean[][] getGrid() {
        return grid;
    }

    public static int getPopulation() {
        return population;
    }

    public static int getGeneration() {
        return generation;
    }

}