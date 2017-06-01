package br.com.saymon.designpatterns.processo.strategy;

import java.util.List;

import br.com.saymon.designpatterns.common.ParametroVO;
import br.com.saymon.designpatterns.processo.builder.ProcessoBuilder;

import static br.com.saymon.designpatterns.processo.composite.ProcessoEnum.*;
import static br.com.saymon.designpatterns.processo.composite.condicao.CondicaoEnum.*;

import br.com.saymon.designpatterns.processo.composite.ProcessoComposite;

public class ExemploEstrategiaUmStrategy implements ProcessoStrategy {

	@Override
	public ProcessoComposite definirEstrategia(List<ParametroVO> parametros) {
		final ProcessoComposite processoComposite = new ProcessoComposite();
		processoComposite.adicionarProcesso(PROCESSO1);
		processoComposite.adicionarProcesso(ProcessoBuilder.processo(PROCESSO2)
						 .se(CONDICAO1).e(CONDICAO2).entao());
		processoComposite.adicionarProcesso(ProcessoBuilder.processo(PROCESSO3)
				 		 .se(CONDICAO2).ou(CONDICAO3).entao());
		processoComposite.adicionarProcesso(ProcessoBuilder.processo(PROCESSO4)
		 		 		 .se(CONDICAO3).eNao(CONDICAO1).entao());
		
		return processoComposite;
	}

}
