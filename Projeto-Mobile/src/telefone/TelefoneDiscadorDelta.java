package telefone;

public class TelefoneDiscadorDelta implements Telefone{
	
	public void telefoneAcionado() {
		System.out.println("USUÁRIO ABRIU O "+"DISCADOR DELTA"+".");
	}

	@Override
	public void iniciarLigacao() {
		telefoneAcionado();
		System.out.println("-Você está fazendo uma ligação-");
	}

	@Override
	public void atenderLigacao() {
		telefoneAcionado();
		System.out.println("-Toc toc toc...ligação atendida-");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		telefoneAcionado();
		System.out.println("-Você não atendeu a ligação. Verifique seu correio de voz-");
		// TODO Auto-generated method stub
		
	}
}