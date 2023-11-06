package matrizmutanprogiii;

public class Main {

    public static void main(String[] args) {
        String[][] matriz1 = {
            //MUTANTE FIL1 Y FIL5 DOS HORIZONTALES
            {"A", "A", "A", "A", "C", "G"},
            {"C", "G", "G", "C", "G", "C"},
            {"T", "T", "T", "A", "C", "T"},
            {"A", "G", "G", "A", "G", "C"},
            {"A", "G", "C", "C", "C", "C"},
            {"T", "C", "A", "C", "T", "G"}
        };
        String[][] matriz2 = {
            //MUTANTE DIAGONALES COL1 Y COL2 DOS DIAGONALES PARALELAS 
            {"A", "A", "G", "C", "G", "A"},
            {"C", "A", "A", "T", "G", "C"},
            {"T", "T", "A", "A", "G", "T"},
            {"A", "G", "A", "A", "A", "G"},
            {"C", "T", "C", "C", "T", "A"},
            {"A", "C", "A", "C", "T", "G"}
        };

        String[][] matriz3 = {
            //MUTANTE CONTRA-DIAGONALES COL6 Y COL6 FIL3 PARALELAS
            {"A", "T", "G", "C", "G", "A"},
            {"C", "G", "G", "T", "A", "C"},
            {"T", "T", "A", "A", "G", "T"},
            {"A", "G", "A", "A", "T", "G"},
            {"C", "A", "C", "T", "T", "A"},
            {"A", "C", "T", "C", "T", "G"}
        };
        
        String[][] matriz4 = {
            //MUTANTE COL3 Y COL6 DOS VERTICALES
            {"A", "T", "G", "C", "G", "A"},
            {"C", "A", "G", "T", "G", "A"},
            {"T", "T", "G", "T", "G", "A"},
            {"A", "G", "G", "A", "T", "A"},
            {"C", "G", "C", "C", "A", "G"},
            {"A", "C", "A", "C", "T", "G"}
        };
        
        String[][] matriz5 = {
            //MUTANTE HORIZONTAL FIL3 Y VERTICAL COL4
            {"A", "T", "G", "T", "G", "A"},
            {"C", "A", "G", "T", "G", "A"},
            {"A", "T", "C", "T", "G", "A"},
            {"T", "T", "T", "T", "T", "C"},
            {"C", "G", "C", "C", "A", "G"},
            {"A", "C", "A", "C", "T", "G"}
        };
        
        String[][] matriz6 = {
            //MUTANTE HORIZONTAL FIL3 Y CONTRA-DIAGONAL COL6 FIL3
            {"A", "T", "G", "T", "G", "A"},
            {"C", "A", "G", "T", "G", "A"},
            {"A", "T", "C", "G", "G", "A"},
            {"T", "T", "T", "T", "A", "C"},
            {"C", "G", "C", "A", "A", "G"},
            {"A", "C", "A", "C", "T", "G"}
        };
        
        String[][] matriz7 = {
            //MUTANTE VERTICAL COL3 Y CONTRA-DIAGONAL COL6 FIL3
            {"A", "T", "G", "T", "G", "A"},
            {"C", "A", "G", "T", "G", "A"},
            {"A", "T", "G", "G", "G", "A"},
            {"T", "T", "G", "T", "A", "C"},
            {"C", "G", "C", "A", "A", "G"},
            {"A", "C", "A", "C", "T", "G"}
        };
        
        String[][] matriz8 = {
            //NO MUTANTE, SOLO HAY UNA COINCIDENCIA VERTICAL COL1
            {"A", "T", "G", "T", "G", "A"},
            {"A", "A", "G", "T", "C", "A"},
            {"A", "T", "T", "G", "T", "A"},
            {"A", "T", "G", "T", "G", "C"},
            {"C", "G", "C", "A", "A", "T"},
            {"A", "C", "A", "C", "T", "G"}
        };
        
        String[][] matriz9 = {
            //NO MUTANTE, SOLO HAY UNA COINCIDENCIA HORIZONTAL FIL2
            {"A", "T", "G", "T", "G", "A"},
            {"C", "C", "C", "C", "T", "A"},
            {"A", "T", "G", "G", "G", "A"},
            {"T", "T", "G", "T", "T", "C"},
            {"C", "G", "C", "A", "A", "G"},
            {"A", "C", "A", "C", "T", "G"}
        };
        
        String[][] matriz10 = {
            //NO MUTANTE, SOLO HAY UNA COINCICENDIA CONTRA-DIAGONAL
            {"A", "T", "G", "T", "G", "A"},
            {"C", "A", "G", "T", "C", "A"},
            {"A", "T", "T", "G", "T", "A"},
            {"T", "T", "G", "T", "A", "C"},
            {"C", "G", "C", "A", "A", "G"},
            {"A", "C", "A", "C", "T", "G"}
        };
        
        String[][] matriz11 = {
            //CASO ERROR, HAY UN CARACTER INVALIDO
            {"A", "T", "G", "T", "G", "A"},
            {"C", "A", "G", "T", "C", "A"},
            {"A", "T", "T", "G", "T", "A"},
            {"T", "T", "G", "T", "F", "C"},
            {"C", "G", "C", "A", "A", "G"},
            {"A", "C", "A", "C", "T", "G"}
        };
        
        String[][] matriz12 = {
            //CASO ERROR, MATRIZ VACÍA
            {},
            {},
            {},
            {},
            {},
            {}
        };
        
                String[][] matriz13 = {
            //CASO ERROR, NO ES CUADRADA
            {"A", "T", "G", "T", "G", "A"},
            {"C", "A", "G", "T", "C", "A"},
            {"A", "T", "T", "G", "T", "A"},
            {"T", "T", "G", "T", "F", "C"},
            {"C", "G", "C", "A", "A", "G"},
            {"A", "C", "A", "C", "T", "G"},
            {"A", "C", "A", "C", "T", "G"}
        };
        
        
        int contador = 1;

        analisisMutante(matriz1, contador);
        contador++;

        analisisMutante(matriz2, contador);
        contador++;
        
        analisisMutante(matriz3, contador);
        contador++;
        
        analisisMutante(matriz4, contador);
        contador++;
        
        analisisMutante(matriz5, contador);
        contador++;
        
        analisisMutante(matriz6, contador);
        contador++;
        
        analisisMutante(matriz7, contador);
        contador++;
        
        analisisMutante(matriz8, contador);
        contador++;
        
        analisisMutante(matriz9, contador);
        contador++;
        
        analisisMutante(matriz10, contador);
        contador++;
        
        analisisMutante(matriz11, contador);
        contador++;
        
        analisisMutante(matriz12, contador);
        contador++;
        
        analisisMutante(matriz13, contador);
        contador++;
    }

    public static void analisisMutante(String[][] matriz, int contador) {
        try {
            Checker verificador = new Checker();
            System.out.println("Matriz Nº: " + contador);
            mostrarMatriz(matriz);
            if (verificador.isMutant(matriz)) {
                System.out.println("Es mutante\n");
            } else {
                System.out.println("No es mutante\n");
            }
        } catch (MatrizException e) {
            System.out.println("Matriz invalida " + e.getMessage());
        }
    }

    public static void mostrarMatriz(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
