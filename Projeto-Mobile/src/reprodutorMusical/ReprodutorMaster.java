package reprodutorMusical;

public class ReprodutorMaster implements ReprodutorMusical {
	
	public void reprodutorAcionado() {
		System.out.println("\nUSUÁRIO ABRIU O "+"REPRODUTOR MASTER"+".");
	}
	
	@Override
	public void tocarMusica() {
		System.out.println("-Você está tocando a música selecionada-");
	}

	@Override
	public void pausarMusica() {
		System.out.println("-Você pausou a música-");
	}

	@Override
	public void selecionarMusica() {
		reprodutorAcionado();
		System.out.println("-Música selecionada. Só dar PLAY!!!-");
	}
}