package br.com.saymon.designpatterns.processo.strategy;

import java.util.List;

import br.com.saymon.designpatterns.common.ParametroVO;

public class ProcessoContext {
	private ProcessoStrategy estrategia;
	
	public ProcessoContext(ProcessoStrategy estrategia) {
		this.estrategia = estrategia;
	}
	
	public List<ParametroVO> executarEstrategia(List<ParametroVO> parametros) {
		return estrategia.definirEstrategia(parametros).executar(parametros);
	}
}
