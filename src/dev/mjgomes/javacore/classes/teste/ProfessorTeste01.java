package dev.mjgomes.javacore.classes.teste;

import dev.mjgomes.javacore.classes.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Marcio";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println("Professor: " + professor.nome + " Com idade de: " + professor.idade + " Sexo(M/F): " + professor.sexo);
    }
}
