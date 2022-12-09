package navegador;

public class NavegadorPrincipal implements Navegador{
	
	public void navegadorAcionado() {
		System.out.println("\nUSUÁRIO ABRIU O "+"NAVEGADOR PRINCIPAL"+".");
	}

	@Override
	public void adicionarAbaNavegador() {
		navegadorAcionado();
		System.out.println("-Aba adicionada-");
	}

	@Override
	public void fecharAbaNavegador() {
		System.out.println("-Abas fechadas-");
	}

	@Override
	public void atualizarAbaNavegador() {
		System.out.println("-Aba atualizada-");
	}
}
