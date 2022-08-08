package dev.mjgomes.javacore.classes.teste;

import dev.mjgomes.javacore.classes.dominio.CarroExecicio;

public class CarroExercicioTeste {
    public static void main(String[] args) {

        CarroExecicio carro1 = new CarroExecicio();
        CarroExecicio carro2 = new CarroExecicio();


        carro1.nome = "BMW";
        carro1.ano = "2022";
        carro1.modelo = "Esportivo";

        carro2.nome = "Honda Fit";
        carro2.ano = "2021";
        carro2.modelo = "Sedan";

        System.out.println("Marca 1: " + carro1.nome + ", " + "Ano de Fabricação: " + carro1.ano +
                ", "+ " Seguimento: " + carro1.modelo);
        System.out.println("*************************************************");
        System.out.println("Marca 2: " + carro2.nome + ", " + "Ano de Fabricação: " + carro2.ano +
                ", "+ " Seguimento: " + carro2.modelo);
    }
}
