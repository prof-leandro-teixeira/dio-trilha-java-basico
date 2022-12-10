package modelos;

import entidades.Cliente;
import interfaces.IConta;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	protected void imprimeDadosComunsExtrato() {
		System.out.println(String.format("- Titular: %s",this.cliente.getNome()));
		System.out.println(String.format("- Agência: %d",this.agencia) );
		System.out.println(String.format("- Número:  %d",this.numeroConta) );
		System.out.println(String.format("- Saldo:   %.2f",this.saldo) );
		System.out.println(String.format("- Data:    12/12/2012") );
		System.out.println("____________________________\n");
	}
	
}