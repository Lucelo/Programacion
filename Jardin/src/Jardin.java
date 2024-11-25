public class Jardin {
    public static void main(String[] args) {

        /* El jardín floreciente:

        Tenemos un tablero de 15x15 que representa un jardín. En él, se siembran flores, representadas por un 1. Pero estas flores necesitan ciertas condiciones para florecer.
⦁	Una flor necesita obligatoriamente estar colindante a una
    casilla con agua (incluso en diagonal) para poder florecer. El agua se representa con un 2.
⦁	Además, una flor necesita que exista una abeja polinizadora
    (representada por un 5) en un radio de 3 casillas.
⦁	Una flor no puede crecer si tiene una mala hierba (representada por un 3)
    colindante, excepto si además la flor (no la mala hierba) es colindante a un
    gusano come-hierbas (representado por un 4), en cuyo caso sí podrá florecer.
⦁	El resto de casillas, que serán de tierra, se representarán con un 0. */

        int[][] Jardin= {
            {1, 0, 0, 0, 1, 0, 0, 0, 2, 1, 1, 0, 0, 5, 0},
            {0, 2, 0, 5, 0, 0, 3, 0, 1, 0, 0, 0, 1, 0, 0},
            {3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 4},
            {0, 0, 2, 0, 0, 0, 0, 0, 2, 1, 3, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 3},
            {4, 3, 0, 0, 0, 2, 1, 0, 0, 0, 0, 5, 0, 0, 0},
            {1, 2, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
            {3, 0, 0, 0, 0, 0, 2, 1, 4, 0, 0, 0, 1, 0, 0},
            {2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0},
            {0, 0, 5, 1, 0, 0, 0, 5, 0, 3, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 2, 4, 0},
            {0, 0, 1, 3, 0, 0, 1, 0, 0, 1, 0, 0, 1, 3, 0},
            {0, 1, 2, 1, 0, 0, 0, 0, 0, 2, 3, 1, 0, 0, 1},
            {1, 3, 4, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 4, 2}
        };



    }
}