public class QtdeVariaveis {

    public static void main(String[] args) {
        
        String tipoEquacao = "Quadrática";

        switch (tipoEquacao) {
            case "Quadrática":{
                System.out.print("Tem x²");
                
            }
            case "Afim":{
                System.out.print(" e tem x.");
                break;
                
            }
            default:{
            System.out.println("Inválido");
            }
        }
    }
}
