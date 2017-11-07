package br.ufal.pitestexemplo;

public class Pessoa {
	private String name;
	private int idade;
	private String profissao;
	
	public Pessoa() {
		this.name = "";
		this.idade = 0;
		this.profissao = "";
	}
	
	public Pessoa(String name, int idade, String profissao) {
		this.name = name;
		this.idade = idade;
		this.profissao = profissao;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public void completouAno(){
		this.idade ++;
	}

}
