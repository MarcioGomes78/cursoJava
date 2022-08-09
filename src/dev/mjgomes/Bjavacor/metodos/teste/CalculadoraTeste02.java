package dev.mjgomes.Bjavacor.metodos.teste;

import dev.mjgomes.Bjavacor.metodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("**********Multipicar**********");
        calculadora.multiplicaDoisNumeros(2, 8);
        System.out.println("**********Dividir**********");
        calculadora.divideDoisNumeros(100, 20);
    }
}
