package br.com.saymon.designpatterns.processo.composite.condicao;

import br.com.saymon.designpatterns.processo.composite.condicao.condicoes.CondicaoDefault;
import br.com.saymon.designpatterns.processo.composite.condicao.condicoes.ExemploCondicao1;
import br.com.saymon.designpatterns.processo.composite.condicao.condicoes.ExemploCondicao2;
import br.com.saymon.designpatterns.processo.composite.condicao.condicoes.ExemploCondicao3;

public enum CondicaoEnum {
	DEFAULT(new CondicaoDefault()),
	CONDICAO1(new ExemploCondicao1()),
	CONDICAO2(new ExemploCondicao2()),
	CONDICAO3(new ExemploCondicao3());
	
	private final Condicao condicao;

	private CondicaoEnum(Condicao condicao) {
		this.condicao = condicao;
	}

	public Condicao getCondicao() {
		return condicao;
	}
	
	
}
