package dev.mjgomes.introducao;

public class Aula12estruturaRepeticaoExercicio {
    public static void main(String[] args) {
        // Imprima todos números pares de 0 até 1000000


        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println("PAR; " + i);
            }
            if (i % 2 == 1){
                System.out.println("IMPAR: " + i);
            }
        }
    }
}
