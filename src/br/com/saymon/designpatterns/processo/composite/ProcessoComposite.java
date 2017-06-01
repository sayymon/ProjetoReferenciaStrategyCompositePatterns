package br.com.saymon.designpatterns.processo.composite;

import java.util.ArrayList;
import java.util.List;

import br.com.saymon.designpatterns.common.ParametroVO;
import br.com.saymon.designpatterns.processo.builder.ProcessoBuilder;
import br.com.saymon.designpatterns.processo.composite.condicao.CondicaoEnum;

public final class ProcessoComposite extends Processo{
	private List<Processo> processos;

	public void adicionarProcesso(final ProcessoEnum processo) {
		ProcessoBuilder processoBuilder = ProcessoBuilder.processo(processo);
		adicionarProcesso(processoBuilder.se(CondicaoEnum.DEFAULT).entao());
	}

	public void adicionarProcesso(final Processo processo) {
		if (processo != null) {
			getProcessos().add(processo);
		}
	}	
	
	@Override
	public List<ParametroVO> executar(final List<ParametroVO> parametros) {
		for (Processo processo : getProcessos()) {
			System.out.println(processo);
			if(processo.getComposicaoCondicoes().seAplica(parametros)){
				processo.executar(parametros);
			}
		}
		return parametros;
	}
	public List<Processo> getProcessos() {
		if (processos == null) {
			processos = new ArrayList<Processo>();
		}
		return processos;
	}
	
	
}
