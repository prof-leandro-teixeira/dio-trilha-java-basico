import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {
            //lógica de contagem
            contar(parametroUm, parametroDois);
            
        } catch (exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExceptions{
        //valida segundo parâmetro deve ser maior que o primeiro
        int contagem = parametroDois - parametroUm;
        for(int i=0; i<contagem; i++){
            System.out.println(contagem);
        }

    }
}