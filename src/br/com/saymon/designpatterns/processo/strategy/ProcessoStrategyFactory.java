package br.com.saymon.designpatterns.processo.strategy;

public final class ProcessoStrategyFactory {
	private ProcessoStrategyFactory() {
	}
	
	public static ProcessoStrategy createExemploEstrategiaUm(){
		return new ExemploEstrategiaUmStrategy();
	}
}
