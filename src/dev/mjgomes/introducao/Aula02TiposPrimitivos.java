package dev.mjgomes.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // byte, boolean, char, double, float, int, long, short
        int idadeInt = 44;
        long numeroGrande = 1000000;
        double salarioDouble = 5000;
        float salarioFloat = 2000;
        byte idadeByte = 18;
        short idadeShort = 10;
        boolean verdairo = true;
        boolean falso = false;
        char caractere = 64;

        System.out.println("A idade do é " + idadeInt + " anos.");
        System.out.println("A idade do é " + idadeByte + " anos.");
        System.out.println("A idade do é " + idadeShort + " anos.");
        System.out.println("A número grande é " + numeroGrande);
        System.out.println("O sálario double é " + salarioDouble);
        System.out.println("O sálario float é " + salarioFloat);
        System.out.println("O verdadeiro é " + verdairo);
        System.out.println("O falso é " + falso);
        System.out.println("O caracter 64 da ASCII é " + caractere);
    }
}
