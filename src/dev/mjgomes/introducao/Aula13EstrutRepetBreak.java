package dev.mjgomes.introducao;

public class Aula13EstrutRepetBreak {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números de um dado valor
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
