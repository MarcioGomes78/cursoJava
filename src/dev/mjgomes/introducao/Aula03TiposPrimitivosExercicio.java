package dev.mjgomes.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome> morando no endereço <endereco> confirmo que recebi o salário <salario> na datd <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){

        String nome = "Marcio";
        String endereco = "Passagem Sol";
        double salario = 2500.0D;
        String dataRecebimentoSalario = "13/12/2022";

        System.out.println("Eu: " + nome);
        System.out.println("Morando no endereço: " + endereco);
        System.out.println("Confirmo que recebi o salário: " + salario);
        System.out.println("Na date: " + dataRecebimentoSalario);
    }
}
