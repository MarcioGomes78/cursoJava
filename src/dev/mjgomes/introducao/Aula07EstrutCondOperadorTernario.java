package dev.mjgomes.introducao;

public class Aula07EstrutCondOperadorTernario {
    public static void main(String[] args) {

        // Doar se salário > 5000
        double salario = 4000;
        String msgDoar = "Vou doar 500 para o DevMarcio";
        //String msgDoarPouco = "Posso doar só 200";
        String msgNaoDoar = "Não posso doar";
        // Usando operador ternário
        // (condição) ? verdadeiro : falso
        String msg = salario > 5000 ? msgDoar : msgNaoDoar;
        // Não é recomendado
        //String msg = salario > 5000 ? msgDoar : salario >= 3000 && salario < 5000 ? msgDoarPouco : msgNaoDoar;
        System.out.println(msg);
         /*
        if (salario > 5000){
            msg = msgDoar;
        }else{
            msg = msgNaoDoar;
        }
        System.out.println(msg);
        */
    }
}
