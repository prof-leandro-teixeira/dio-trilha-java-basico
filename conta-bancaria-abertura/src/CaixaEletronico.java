public class CaixaEletronico {

    public static void main(String[] args) {
        
    double saldo = 25.0;
    double valorSolicitado = 29.0;
    double chequeEspecial = 5.0;

    if(valorSolicitado<saldo){
        saldo = saldo-valorSolicitado;
        System.out.println("Saldo: " + saldo);
    }
    else if(valorSolicitado-chequeEspecial<saldo){
        saldo = saldo-valorSolicitado;
        System.out.println("Você entrou no cheque especial. Saldo: " + saldo);
    }
    else
    System.out.println("Saldo insuficiente");
    }
}
