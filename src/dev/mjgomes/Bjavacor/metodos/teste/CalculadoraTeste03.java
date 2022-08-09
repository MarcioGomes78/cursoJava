package dev.mjgomes.Bjavacor.metodos.teste;

import dev.mjgomes.Bjavacor.metodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(100, 2);
        System.out.println("**********Dividir**********");
        System.out.println(resultado);


    }
}
