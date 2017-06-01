package br.com.saymon.designpatterns.processo.builder;

import br.com.saymon.designpatterns.processo.composite.Processo;
import br.com.saymon.designpatterns.processo.composite.ProcessoEnum;
import br.com.saymon.designpatterns.processo.composite.condicao.Condicao;
import br.com.saymon.designpatterns.processo.composite.condicao.CondicaoEnum;
import br.com.saymon.designpatterns.processo.composite.condicao.TipoCondicaoEnum;

public class ProcessoBuilder {
    private Processo processo;

	private ProcessoBuilder(final ProcessoEnum processoEnum) {
		 this.processo = processoEnum.getProcesso();
	}

	public static ProcessoBuilder processo(final ProcessoEnum processoEnum) {
        return new ProcessoBuilder(processoEnum);
    }	

	public ProcessoBuilder se(final CondicaoEnum condicaoEnum) {
		return e(condicaoEnum);
    }
	public ProcessoBuilder e(final CondicaoEnum condicaoEnum) {
		final Condicao condicao = condicaoEnum.getCondicao();
		condicao.setTipoCondicao(TipoCondicaoEnum.E);		
		processo.getComposicaoCondicoes().getCondicoes().add(condicao);
		return this;
    }

	public ProcessoBuilder ou(final CondicaoEnum condicaoEnum) {
		final Condicao condicao = condicaoEnum.getCondicao();
		condicao.setTipoCondicao(TipoCondicaoEnum.OU);		
		processo.getComposicaoCondicoes().getCondicoes().add(condicao);
		return this;
    }	

	public ProcessoBuilder eNao(final CondicaoEnum condicaoEnum) {
		final Condicao condicao = condicaoEnum.getCondicao();
		condicao.setTipoCondicao(TipoCondicaoEnum.NAO);		
		processo.getComposicaoCondicoes().getCondicoes().add(condicao);
		return this;
    }	
	public Processo entao() {
		return processo;
	}
}
