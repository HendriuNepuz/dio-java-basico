import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
    }
    //Método criado para gera valores aleatórios entre 2 e 8
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
       }
}
