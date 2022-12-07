import java.util.concurrent.ThreadLocalRandom;

public class WhileAleatorio {
    public static void main(String[] args) {
        double mesada = 20.00;
       
        while(mesada>0){
           Double valorDoce = valorAleatorio();
            if(valorDoce>mesada)
                valorDoce = mesada;
                         

            System.out.println("Mesada restante é: R$" + mesada);
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: R$" + mesada);
    }
    
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(4,7);
    }
}
