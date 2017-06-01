package br.com.saymon.designpatterns.processo.composite.condicao.condicoes;

import java.util.List;

import br.com.saymon.designpatterns.common.ParametroVO;
import br.com.saymon.designpatterns.processo.composite.condicao.Condicao;

public class ExemploCondicao1 extends Condicao{

	@Override
	public Boolean seAplica(List<ParametroVO> parametros) {
		return true;
	}

}
