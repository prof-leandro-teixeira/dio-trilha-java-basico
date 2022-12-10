package entidades;

import modelos.Conta;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("___EXTRATO CONTA POUPANÇA___");
		super.imprimeDadosComunsExtrato();
	}
}
