package dev.mjgomes.Ajavacore.classes.teste;

import dev.mjgomes.Ajavacore.classes.dominio.Estudante;

public class ProgramaTeste02 {
    public static void main(String[] args) {

        Estudante pessoa = new Estudante();
        Estudante pessoa02 = new Estudante();

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
