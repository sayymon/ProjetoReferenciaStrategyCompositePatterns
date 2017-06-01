/**
 * 
 */
package br.com.saymon.designpatterns.processo.strategy;

import java.util.List;

import br.com.saymon.designpatterns.common.ParametroVO;
import br.com.saymon.designpatterns.processo.composite.ProcessoComposite;

/**
 * @author user
 *
 */
public interface ProcessoStrategy {
	public ProcessoComposite definirEstrategia(List<ParametroVO> parametros);
}
