package dev.mjgomes.introducao;

public class Aula11EstruturaRepeticao {
    public static void main(String[] args) {
        // while, do while e for
        int count = 0;
        while (count < 10) {
            //System.out.println(count);
            System.out.println("Contando: " + ++count);
            //count++;
        }

        count = 0;
        do {
            System.out.println("Dentro do do-while: " + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("Contando: " + i);
        }
    }
}
