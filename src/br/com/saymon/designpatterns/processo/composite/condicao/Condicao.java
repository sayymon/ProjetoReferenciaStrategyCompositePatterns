/**
 * 
 */
package br.com.saymon.designpatterns.processo.composite.condicao;

import java.util.List;

import br.com.saymon.designpatterns.common.ParametroVO;

/**
 * @author Saymon
 *
 */
public abstract class Condicao {
	private TipoCondicaoEnum tipoCondicao;
	
	public abstract Boolean seAplica(List<ParametroVO> parametros);

	public TipoCondicaoEnum getTipoCondicao() {
		return tipoCondicao;
	}

	public void setTipoCondicao(TipoCondicaoEnum tipoCondicao) {
		this.tipoCondicao = tipoCondicao;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+ " [tipoCondicao=" + tipoCondicao + "]";
	}
	
	

}
