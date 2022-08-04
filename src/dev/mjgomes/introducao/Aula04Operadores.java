package dev.mjgomes.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // Operadores Aritméticos (+, -, *, /)
        int num1 = 40;
        int num2 = 20;
        System.out.println("#####################################");
        System.out.println("A soma é: " + (num1 + num2));
        System.out.println("A subtração é: " + (num1 - num2));
        System.out.println("A multipicação é: " + num1 * num2);
        System.out.println("A divisão é: " + num1 / num2);
        System.out.println("#####################################");
        // Operador resto (%), para saber se o número e par ou ímpar
        int resto = 21 % 5;
        System.out.println("o resto é: " + resto);
        if (resto == 0){
            System.out.println("Número Par");
        }else {
            System.out.println("Número Ímpar");
        }
        System.out.println("#####################################");
        // Operadores Relacionais
        // Servem para saber se é Verdadeiro ou Falso (True or False)
        /*
        1- Maior que: >
        2- Menor que: <
        3- Igual à  : ==
        4- Maior ou igual: >=
        5- Menor ou igual: <=
        6- Diferente: !=
         */
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezMenorOuIgualADez = 10 <= 10;
        boolean isDezMaiorOuIgualADez = 10 >= 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte: " + isDezIgualAVinte);
        System.out.println("isDezIgualADez: " + isDezIgualADez);
        System.out.println("isDezMenorOuIgualADez: " + isDezMenorOuIgualADez);
        System.out.println("isDezMaiorOuIgualADez: " + isDezMaiorOuIgualADez);
        System.out.println("isDezDiferenteDeDez: " + isDezDiferenteDeDez);
        // Operadores Lógicos
        // AND em java é dois E comercial(&&)
        // OR em java é dois Pipe(||)

        int idade = 25;
        double salario = 3500.0;
        // AND: as duas condições devem ser verdadeiro
        boolean isMaiorQueTrinta = idade >= 30 && salario >= 4600.0;
        boolean isMenorQueTrinta = idade < 30 && salario >= 3000.0;
        System.out.println("#####################################");
        System.out.println("isMaiorQueTrinta: " + isMaiorQueTrinta);
        System.out.println("isMenorQueTrinta: " + isMenorQueTrinta);
        // OR: Uma das condições deve ser verdadeiro.
        double contaCorrente = 200;
        double contaPoupanca = 10000;
        double valorPlayStation = 5000;

        boolean comprarPlayStation = contaCorrente > valorPlayStation || contaPoupanca > valorPlayStation;
        System.out.println("#####################################");
        System.out.println("Tenho saldo para comprar PlayStation 5: " + comprarPlayStation);

        // Operadores de atribuição: =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus = bonus + 2000;
        bonus -= 2000;
        bonus *= 2;
        bonus /= 3;
        bonus %= 2;
        System.out.println("#####################################");
        System.out.println(bonus);

        // Incremental
        int contador = 0;
        contador = contador + 1;
        contador++;
        contador--;
        System.out.println("#####################################");
        System.out.println(contador);
    }
}
