package dev.mjgomes.introducao;
// Para estudo
public class Aula16Arrays02 {
    public static void main(String[] args) {
        // Inicialização default
        // byte, short, int, float, long e double: 0
        // char: '\u0000' e ' '
        // boolean: false
        // String: null
        // Seu valor é fixo
        String[] nome = new String[4];
        // Quando for alterar o valor deve-se alterar todos os valores
        nome[0] = "Marcio";
        nome[1] = "Kevin";
        nome[2] = "Brenda";
        nome[3] = "Emilly";

        for (int i = 0; i < nome.length; i++ ) {
            System.out.println(nome[i]);
        }
    }
}
