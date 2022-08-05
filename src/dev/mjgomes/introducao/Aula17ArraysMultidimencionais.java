package dev.mjgomes.introducao;

public class Aula17ArraysMultidimencionais {
    public static void main(String[] args) {
        // Arrays Multidimencionais
        // Meses: 1, 2, 3, 4, 5, ...
        // Dias: 31, 30, 29, 28, 27, 26, ...

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 30;
        dias[0][2] = 29;
        dias[1][0] = 28;
        dias[1][1] = 27;
        dias[1][2] = 26;
        dias[2][0] = 25;
        dias[2][1] = 24;
        dias[2][2] = 23;

        // Usando for each
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println("Dias: " + num);
            }
        }

//       for (int i = 0; i < dias.length; i++) {
//            for (int j = 0; j < dias[0].length; j++) {
//                System.out.println("Dias: " + dias[i][j]);
//            }
//        }

        // Faz a varredura de uma matriz linha por linha
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Posição: " + i + " , " + j);
            }
        }
    }
}
