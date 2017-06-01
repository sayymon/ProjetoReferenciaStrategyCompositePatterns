/**
 * 
 */
package br.com.saymon.designpatterns.processo.processos;

import java.util.List;

import br.com.saymon.designpatterns.common.ParametroVO;
import br.com.saymon.designpatterns.processo.composite.Processo;

/**
 * @author user
 *
 */
public class ProcessoExemploImpl5 extends Processo{

	@Override
	public List<ParametroVO> executar(List<ParametroVO> parametros) {
		final ParametroVO parametroVO = new ParametroVO();
		parametroVO.setNome("ProcessoExemploImpl5");
		parametros.add(parametroVO);
		return parametros;
	}

}
