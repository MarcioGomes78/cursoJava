package dev.mjgomes.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 20;
        boolean autorizado = idade >= 18;
        if (autorizado){
            System.out.println("Pode comprar bebida");
        }
        // Negação (!)
        if (!autorizado){
            System.out.println("Pode comprar bebida");
        }
        // Isso existe
        boolean c = false;
        if (c = true){
            System.out.println("########################################");
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("########################################");
        System.out.println("Beba a vontade");
    }
}
