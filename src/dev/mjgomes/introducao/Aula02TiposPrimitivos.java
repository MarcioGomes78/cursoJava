package dev.mjgomes.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // byte, boolean, char, double, float, int, long, short
        // Casting é forçar um tipo primitivo a aceitar outro tipo maior
        // pela conveção utilliza-se a letra maiúscula do respectivo tipo no final do número
        int idadeInt = (int)1000000000000L;
        long numeroGrande = 1000000L;
        double salarioDouble = 5000.0D;
        float salarioFloat = 2000.0F;
        byte idadeByte = 18;
        short idadeShort = 10;
        boolean verdairo = true;
        boolean falso = false;
        char caractere = 64;

        System.out.println("A idade int é " + idadeInt + " anos.");
        System.out.println("A idade byte é " + idadeByte + " anos.");
        System.out.println("A idade short é " + idadeShort + " anos.");
        System.out.println("A número grande é " + numeroGrande);
        System.out.println("O sálario double é " + salarioDouble);
        System.out.println("O sálario float é " + salarioFloat);
        System.out.println("O verdadeiro é " + verdairo);
        System.out.println("O falso é " + falso);
        System.out.println("O caracter 64 da ASCII é " + caractere);
    }
}
