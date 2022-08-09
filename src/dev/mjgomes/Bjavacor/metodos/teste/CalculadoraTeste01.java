package dev.mjgomes.Bjavacor.metodos.teste;

import dev.mjgomes.Bjavacor.metodos.dominio.Calculadora;

public class CalculadoraTeste01 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Somado!");
        System.out.println("****************************");
        calculadora.subtraiDoisNumeros();
        System.out.println("Subtaído!");
        System.out.println("****************************");
        calculadora.multiplicaDoisNumeros();
        System.out.println("Multiplicado");
        System.out.println("****************************");
        calculadora.divideDoisNumeros();
        System.out.println("Dividido");
    }
}
