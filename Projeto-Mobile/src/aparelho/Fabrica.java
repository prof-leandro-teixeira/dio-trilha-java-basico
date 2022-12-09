package aparelho;

import navegador.Navegador;
import navegador.NavegadorPrincipal;
import reprodutorMusical.ReprodutorMaster;
import reprodutorMusical.ReprodutorMusical;
import telefone.Telefone;
import telefone.TelefoneDiscadorDelta;

public class Fabrica {
	public static void main(String[] args) {
		Telefone tel = new TelefoneDiscadorDelta();
		Navegador web = new NavegadorPrincipal();
		ReprodutorMusical audio = new ReprodutorMaster();

		System.out.println("Vamos simular algumas ações em um aparelho celular.");
		System.out.println("APARELHO LIGADO.");

		audio.selecionarMusica();
		audio.tocarMusica();

		web.adicionarAbaNavegador();
		web.atualizarAbaNavegador();

		System.out.println("\nO telefone está tocando");
		tel.atenderLigacao();

		System.out.println("\nAlerta de ligação perdida.");
		tel.iniciarCorreioDeVoz();
	}
}
