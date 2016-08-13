package br.com.hyperclass.strategypattern;

public class Calculadora {

	private Calcular calcular;

	public Calculadora() {
		super();
	}
	
	public double resultadoCalculadora(final double valor1, final double valor2){
		return calcular.calcular(valor1, valor2);
	}
	
	public void tipoOperacao(Calcular calcular){
		setCalcular(calcular);
	}

	private void setCalcular(Calcular calcular) {
		this.calcular = calcular;
	}
	
	
	
}
