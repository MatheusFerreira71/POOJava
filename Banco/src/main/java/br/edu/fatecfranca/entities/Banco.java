package br.edu.fatecfranca.entities;

public class Banco {
	private String _id, nome;
	private float lucro;
	private int nro, qtdeAgencias;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getLucro() {
		return lucro;
	}
	public void setLucro(float lucro) {
		this.lucro = lucro;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public int getQtdeAgencias() {
		return qtdeAgencias;
	}
	public void setQtdeAgencias(int qtdeAgencias) {
		this.qtdeAgencias = qtdeAgencias;
	}
}
