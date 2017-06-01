/**
 * 
 */
package br.com.saymon.designpatterns.processo.composite;

import br.com.saymon.designpatterns.processo.processos.ProcessoExemploImpl1;
import br.com.saymon.designpatterns.processo.processos.ProcessoExemploImpl2;
import br.com.saymon.designpatterns.processo.processos.ProcessoExemploImpl3;
import br.com.saymon.designpatterns.processo.processos.ProcessoExemploImpl4;
import br.com.saymon.designpatterns.processo.processos.ProcessoExemploImpl5;

/**
 * @author user
 *
 */
public enum ProcessoEnum {
	PROCESSO1(new ProcessoExemploImpl1()),
	PROCESSO2(new ProcessoExemploImpl2()),
	PROCESSO3(new ProcessoExemploImpl3()),
	PROCESSO4(new ProcessoExemploImpl4()),
	PROCESSO5(new ProcessoExemploImpl5());
	
	private final Processo processo;

	private ProcessoEnum(Processo processo) {
		this.processo = processo;
	}

	public Processo getProcesso() {
		return processo;
	}
	
	
}
