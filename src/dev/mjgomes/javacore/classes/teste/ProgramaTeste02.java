package dev.mjgomes.javacore.classes.teste;

import dev.mjgomes.javacore.classes.dominio.Pessoa;

public class ProgramaTeste02 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa pessoa02 = new Pessoa();

        pessoa.nome = "Marcio";
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);
        System.out.println("---------------------------------------");
        System.out.println(pessoa02.nome);
        System.out.println(pessoa02.idade);
        System.out.println(pessoa02.sexo);

    }
}
