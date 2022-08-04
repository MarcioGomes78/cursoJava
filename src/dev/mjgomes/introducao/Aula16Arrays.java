package dev.mjgomes.introducao;

public class Aula16Arrays {
    public static void main(String[] args) {

        // Ao iniciar um array deve declarer o tipo e a quantidade de espaço em memória estará alocando
        // Ao instance o array que são objetos, os valores em suas posições é zero(0)
        int[] idades = new int[3];
        // Os arrays são indexados
        idades[0] = 21;
        idades[1] = 25;
        idades[2] = 29;

        // A Variável idade está fazendo referência em memória que é os 3 espaços
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
