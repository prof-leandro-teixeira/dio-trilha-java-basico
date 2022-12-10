package app;

import entidades.Cliente;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;
import modelos.Conta;

public class Main {

	public static void main(String[] args) {
		Cliente pai = new Cliente();
		pai.setNome("Pai");
		Cliente filho = new Cliente();
		filho.setNome("Filho");
		
		Conta cc = new ContaCorrente(pai);
		Conta cp = new ContaPoupanca(filho);
		
		cc.depositar(1000);
				
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc.transferir(200, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
