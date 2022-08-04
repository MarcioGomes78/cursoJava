package dev.mjgomes.introducao;

public class Aula16Arrays03 {
    public static void main(String[] args) {

        // Formas de inicializar um array
        int[] numeros = new int[3]; // Array Inicializado com as posições
        int[] numeros2 = {1, 2, 3, 4, 5};// Array inicializado com os valores
        int[] numeros3 = new int[]{10, 20, 30, 40, 50};

//        for (int i = 0; i < numeros2.length; i++) {
//            System.out.println(numeros2[i]);
//        }

        // for indexado
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }
        // O for each não pode acessar os índices
        // A variável de referência deve ser a mesma do array que nesse caso o (int)
        for (int num : numeros2) {
            System.out.println(num);
        }
    }
}
