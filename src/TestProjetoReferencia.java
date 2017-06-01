import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.saymon.designpatterns.common.ParametroVO;
import br.com.saymon.designpatterns.processo.strategy.ProcessoContext;
import br.com.saymon.designpatterns.processo.strategy.ProcessoStrategy;
import br.com.saymon.designpatterns.processo.strategy.ProcessoStrategyFactory;

public class TestProjetoReferencia {

	@Test
	public void test() {
		ProcessoStrategy exemploEstrategiaUm = ProcessoStrategyFactory.createExemploEstrategiaUm();
		List<ParametroVO> parametros = new ArrayList<ParametroVO>();
		ParametroVO parametroVO = new ParametroVO();
		parametroVO.setNome("testeDesignPatterns");
		parametros.add(parametroVO);
		exemploEstrategiaUm.definirEstrategia(parametros);
		
		ProcessoContext processoContext = new ProcessoContext(exemploEstrategiaUm);
		List<ParametroVO> executarEstrategia = processoContext.executarEstrategia(parametros);
		System.out.println(executarEstrategia);
	}

}
