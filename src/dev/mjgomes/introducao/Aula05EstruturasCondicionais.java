package dev.mjgomes.introducao;
// Para estudo
public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 15;
        boolean autorizado = idade >= 18;
        // se for true
        if (autorizado){
            // verdadeiro exibe essa msg
            System.out.println("*************true***************");
            System.out.println("Pode comprar bebida");
            // se não for true
        }else{
            // Exibe essa msg
            System.out.println("*************false***************");
            System.out.println("Não Pode comprar bebida");
        }
        // Negação (!)
        // Instruções independente
        if (!autorizado){
            System.out.println("*************false***************");
            System.out.println("Não Pode comprar bebida");
        }
        // Isso existe
        boolean c = false;
        if (c = true){
            System.out.println("########################################");
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
    }
}
