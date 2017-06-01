package br.com.saymon.designpatterns.processo.composite.condicao;

import java.util.ArrayList;
import java.util.List;

import br.com.saymon.designpatterns.common.ParametroVO;

public final class CondicaoComposite extends Condicao{

	private List<Condicao> condicoes;
	
	@Override
	public Boolean seAplica(List<ParametroVO> parametros) {
		Boolean isAplica = true;
		
		for (final Condicao condicao : getCondicoes()) {
			switch (condicao.getTipoCondicao()) {
			case E:
				isAplica = isAplica && condicao.seAplica(parametros);
				break;
			case OU:
				isAplica = isAplica || condicao.seAplica(parametros);
				break;
			case NAO:
				isAplica = !(isAplica && condicao.seAplica(parametros));
				break;
			default:
				isAplica = condicao.seAplica(parametros);
				break;
			}
		}
		return isAplica;
	}

	public List<Condicao> getCondicoes() {
		if (condicoes == null) {
			condicoes = new ArrayList<Condicao>();
		}
		return condicoes;
	}

	@Override
	public String toString() {
		return "CondicaoComposite [condicoes=" + condicoes + "]";
	}
	
	

}
