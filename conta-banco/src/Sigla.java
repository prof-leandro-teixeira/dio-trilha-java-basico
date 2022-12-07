public class Sigla {

    public static void main(String[] args) {
    String sigla = "m";

    switch (sigla.toUpperCase()) {
        case "P":{
            System.out.println("Pequeno");
            break;
        }
        
        case "M":{
            System.out.println("Médio");
            break;
        }

        case "G":{
            System.out.println("Grande");
            break;
        }
    
        default:{
            System.out.println("Inválido");
            break;
            }
        }
    }
}