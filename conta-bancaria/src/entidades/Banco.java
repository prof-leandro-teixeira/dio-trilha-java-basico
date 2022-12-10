package entidades;

import java.util.List;

import modelos.Conta;

public class Banco {
	
	private String nome;
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
	}
	public void setNome() {
		this.nome = nome;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
