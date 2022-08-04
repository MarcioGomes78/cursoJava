package dev.mjgomes.introducao;

public class Aula09CondicionalSwitch {
    public static void main(String[] args) {
        int diaSemana = 1;
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não existe esse dia!");
        }

        String sexo = "M";
        switch (sexo){
            case "M":
                System.out.println("Mulher");
                break;
            case "H":
                System.out.println("Homem");
                break;
            default:
                System.out.println("Letra Inválida!");
        }
    }
}
