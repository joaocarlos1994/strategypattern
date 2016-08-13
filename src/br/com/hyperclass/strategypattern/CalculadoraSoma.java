package br.com.hyperclass.strategypattern;

public class CalculadoraSoma implements Calcular {

	@Override
	public double calcular(final double valor1, final double valor2) {
		// TODO Auto-generated method stub
		return valor1 + valor2;
	}

}
