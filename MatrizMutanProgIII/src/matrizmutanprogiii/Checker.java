package matrizmutanprogiii;

public class Checker {
    public boolean isMutant(String[][] adn) throws MatrizException {
        int n = adn.length;
        if (n == 0) {
            throw new MatrizException("La matriz ingresada esta vacia.");
        }
        for (int i = 0; i < n; i++) {
            if (adn[i].length != n) {
                throw new MatrizException("La matriz ingresada no es una matriz cuadrada");
            }
            for (int j = 0; j < n; j++) {
                if (!adn[i][j].matches("[ATCG]")) {
                    throw new MatrizException("La matriz ingresada contiene caracteres no validos. (Solo A, T, C, G)");
                }
            }
        }
        int cont = 0;
        cont += contadorHorizontal(adn);
        cont += contadorVertical(adn);
        cont += contadorDiagonal(adn);
        return cont >= 2;
    }

    private int contadorHorizontal(String[][] adn) {
        int contador = 0;
        for (int i = 0; i < adn.length; i++) {
            for (int j = 0; j < adn[i].length - 3; j++) {
                if (adn[i][j].equals(adn[i][j+1]) && adn[i][j].equals(adn[i][j+2]) && adn[i][j].equals(adn[i][j+3])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    private int contadorVertical(String[][] adn) {
        int contador = 0;
        for (int i = 0; i < adn.length - 3; i++) {
            for (int j = 0; j < adn[i].length; j++) {
                if (adn[i][j].equals(adn[i+1][j]) && adn[i][j].equals(adn[i+2][j]) && adn[i][j].equals(adn[i+3][j])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    private int contadorDiagonal(String[][] adn) {
        int contador = 0;
        contador += contadorDiagonalArribaIzqHastaAbajoDer(adn);
        contador += contadorDiagonalAbajoIzqHastaArribaDer(adn);
        return contador;
    }

    private int contadorDiagonalArribaIzqHastaAbajoDer(String[][] adn) {
        int contador = 0;
        for (int i = 0; i < adn.length - 3; i++) {
            for (int j = 0; j < adn[i].length - 3; j++) {
                if (adn[i][j].equals(adn[i+1][j+1]) && adn[i][j].equals(adn[i+2][j+2]) && adn[i][j].equals(adn[i+3][j+3])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    private int contadorDiagonalAbajoIzqHastaArribaDer(String[][] adn) {
        int contador = 0;
        for (int i = 3; i < adn.length; i++) {
            for (int j = 0; j < adn[i].length - 3; j++) {
                if (adn[i][j].equals(adn[i-1][j+1]) && adn[i][j].equals(adn[i-2][j+2]) && adn[i][j].equals(adn[i-3][j+3])) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
