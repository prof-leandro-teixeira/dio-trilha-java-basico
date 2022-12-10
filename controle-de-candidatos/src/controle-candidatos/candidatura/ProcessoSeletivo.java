package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String[] candidatos = { "João", "Maria", "Alessando", "Joana", "Ismael", "Fernanda", "Eduardo", "Kleberson" };
		imprimirListaCandidatos();
		selecaoCandidatos();
		System.out.println("Processo Seletivo.");
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
	}

	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando) {
				tentativasRealizadas++;
			} else {
				System.out.println("Contato realizado com sucesso.");
			}

		} while (continuarTentando && tentativasRealizadas < 3);
		if (atendeu) 
			System.out.println("Conseguimos contato com canditado " + candidato + " na tentativa " + tentativasRealizadas+".");
		 else 
			System.out.println("Não conseguimos contato " + candidato + " em um número máximo de tentativas "+tentativasRealizadas +".");
		
	}

	static void imprimirListaCandidatos() {
		String[] candidatos = { "João", "Maria", "Alessando", "Joana", "Ismael", "Fernanda", "Eduardo", "Kleberson" };
		int cont = 0;
		for (String i : candidatos) {
			System.out.println("Candidato " + (cont + 1) + " - " + i);
			cont++;
		}
	}

	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}

	static void selecaoCandidatos() {
		String[] candidatos = { "João", "Maria", "Alessando", "Joana", "Ismael", "Fernanda", "Eduardo", "Kleberson" };

		int cadidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while (cadidatosSelecionados < 8) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();

			System.out.println("O candidato " + candidato + " informou o salário desejado de R$ " + salarioPretendido);
			if (salarioBase > salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para vaga.");
				cadidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2000);
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidado.");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta.");
		} else {
			System.out.println("Aguardando resultado dos demais candidatos.");
		}
	}
}
