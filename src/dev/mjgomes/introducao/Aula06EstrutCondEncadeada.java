package dev.mjgomes.introducao;

public class Aula06EstrutCondEncadeada {
    public static void main(String[] args) {
    // idade < 15 : categoria infantil
    // idade >= 15 && idade < 18 : categoria juvenil
    //idade >= 18 : categoria adulto
    // Variáveis locais devem ser inicializadas

    int idade = 19;
    if (idade < 15){
        System.out.println("Categoria Infantil");
    }else if (idade >= 15 && idade < 18){
        System.out.println("Categoria Juvenil");
    }else {
        System.out.println("Categoria Adulto");
    }
    }
}
