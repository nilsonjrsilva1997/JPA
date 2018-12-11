package br.com.financas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pessoa {
	@Id
	@GeneratedValue
	private String cpfPessoa;
	private String nomePessoa;
	private int idadePessoa;

	public Pessoa(String cpfPessoa, String nomePessoa, int idadePessoa) {
		super();
		this.cpfPessoa = cpfPessoa;
		this.nomePessoa = nomePessoa;
		this.idadePessoa = idadePessoa;
	}

	public Pessoa() {
		super();
	}

	public String getCpfPessoa() {
		return cpfPessoa;
	}

	public void setCpfPessoa(String cpfPessoa) {
		this.cpfPessoa = cpfPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public int getIdadePessoa() {
		return idadePessoa;
	}

	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}
}
