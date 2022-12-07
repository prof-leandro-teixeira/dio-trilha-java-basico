import java.util.Random;

public class LigacaoTelefonica {
    public static void main(String[] args) {

        System.out.println("Fazendo chamada...");
        do{
            System.out.println("Telefone tocando");
        }
        while (tocando());
        
        System.out.println("Ligação atendida.");

    }
        
        private static boolean tocando(){
            boolean atendeu = new Random().nextInt(4)==1;
            System.out.println("Atendeu? " + atendeu);
            return ! atendeu;
        }
    }
    
