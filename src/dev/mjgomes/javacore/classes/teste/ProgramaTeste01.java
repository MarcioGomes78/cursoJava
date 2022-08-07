package dev.mjgomes.javacore.classes.teste;

import dev.mjgomes.javacore.classes.dominio.Estudante;
// Para estudo
public class ProgramaTeste01 {
    public static void main(String[] args) {

        // Intanciando um novo objeto
        Estudante pessoa = new Estudante();

        // Chamando os atributos da classe
        pessoa.nome = "Marcio";
        pessoa.idade = 44;
        pessoa.sexo = 'M';

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);
    }
}
