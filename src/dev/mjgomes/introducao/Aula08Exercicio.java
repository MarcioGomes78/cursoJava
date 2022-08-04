package dev.mjgomes.introducao;

import java.util.Locale;

public class Aula08Exercicio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double salarioAnual = 25000.00;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34700.00){
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34700.00 && salarioAnual <= 68500.00) {
            valorImposto = salarioAnual * segundaFaixa;
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.printf("O valor do imposto é: %.2f",valorImposto);
    }
}
