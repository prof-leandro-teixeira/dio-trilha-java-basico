public class ForArray {
    public static void main(String[] args) {
        String nomes[] = {"Ana","Bia","Carlos","Daniel"};

        //FOR
        for(int i=0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }

        //FOREACH
        for(String nome: nomes){
            System.out.println(nome);

        }
    }
    
}
