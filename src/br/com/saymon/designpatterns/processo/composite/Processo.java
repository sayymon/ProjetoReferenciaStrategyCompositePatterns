/**
 * 
 */
package br.com.saymon.designpatterns.processo.composite;

import java.util.List;

import br.com.saymon.designpatterns.common.ParametroVO;
import br.com.saymon.designpatterns.processo.composite.condicao.CondicaoComposite;

/**
 * @author user
 *
 */
public abstract class Processo {
	private CondicaoComposite composicaoCondicoes;
	
	public abstract List<ParametroVO> executar(final List<ParametroVO> parametros);

	public CondicaoComposite getComposicaoCondicoes() {
		if (composicaoCondicoes == null) {
			composicaoCondicoes = new CondicaoComposite();
		}
		return composicaoCondicoes;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" [composicaoCondicoes=" + composicaoCondicoes + "]";
	}
	
	
}
