package dzshestodinmetody;

public class Task01 {
    static int[][] createDiagonalUnitMatrix (int count) {
        int[][] mass = new int[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j == i) {
                    mass[i][j] = 1;
                }
            }
        }
        return mass;
    }

    static int[][] createNullMatrix (int count) {
        int[][] mass = new int[count][count];
        return mass;
    }
    static int[][] sumMatrix (int[][] array1, int[][] array2) {
        int[][] mass = new int [array1.length][array2.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                mass[i][j] = array1[i][j] + array2[i][j];
                }
            }
        return mass;
    }

    static int[][] multSkalyarMatrix (int[][] array, int mult) {
        int[][] mass = new int [array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                mass[i][j] = mult * array[i][j];
            }
        }
        return mass;
    }

    static int determinantMatrix (int[][] array) {
        int determinant = 0;
        if (array.length == 1) {
            determinant = array[0][0];
        }
        if (array.length == 2) {
            determinant = array[0][0] * array[1][1] - array[0][1] * array[1][0];
        }
        if (array.length == 3) {
            int[][] matrix = new int [array.length][2 * array.length - 1];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; i < array.length; j++) {
                    matrix[i][j] = array[i][j];
                    if (j < array.length - 1) {
                        matrix[i][array.length + j] = array[i][j];
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                int mult1 = 1;
                int mult2 = 1;
                for (int j = 0; j < array.length; j++) {
                    mult1 *= matrix[i][i + j];
                    mult2 *= matrix[i][array.length - 1 + i - j];
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int[][] mass = new int[array.length][array.length];
                mass[i][j] = array[i][j];
            }
        }
        return determinant;
    }
}
