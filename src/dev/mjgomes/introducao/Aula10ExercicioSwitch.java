package dev.mjgomes.introducao;

public class Aula10ExercicioSwitch {
    public static void main(String[] args) {
        int dia = 6;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
}
