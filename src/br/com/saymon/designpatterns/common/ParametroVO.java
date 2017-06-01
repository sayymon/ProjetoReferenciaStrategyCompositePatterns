package br.com.saymon.designpatterns.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Estrutura dinamica de parametro 
 * com recursividade de outros parametros 
 * para montagem de estrutura em arvore
 * Ex : Objeto > Lista > Lista > Objeto ...
 * 
 * @author Saymon
 *
 */
public class ParametroVO {
	private Integer id;
	private String nome;
	private String descricao;
	private Object valor;
	private List<ParametroVO> parametros;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	public List<ParametroVO> getParametros() {
		if (parametros == null) {
			parametros = new ArrayList<ParametroVO>();
		}
		return parametros;
	}
	@Override
	public String toString() {
		return "\nParametroVO [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor
				+ "\n, parametros=" + parametros + "]";
	}
	
	
}
