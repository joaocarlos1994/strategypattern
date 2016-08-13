package br.com.hyperclass.strategypattern;

public class Main {

	public static void main(String[] args) {
		
		CalculadoraSoma calculadoraSoma = new CalculadoraSoma();
		CalculadoraSubtracao calculadoraSubtracao = new CalculadoraSubtracao();
		CalculadoraMultiplicacao calculadoraMultiplicacao = new CalculadoraMultiplicacao();
		CalculadoraDivisao calculadoraDivisao = new CalculadoraDivisao();
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.tipoOperacao(calculadoraSoma);
		System.out.println(calculadora.resultadoCalculadora(1, 1));
		
		calculadora.tipoOperacao(calculadoraSubtracao);
		System.out.println(calculadora.resultadoCalculadora(1, 1));
		
		calculadora.tipoOperacao(calculadoraMultiplicacao);
		System.out.println(calculadora.resultadoCalculadora(2, 2));
		
		calculadora.tipoOperacao(calculadoraDivisao);
		System.out.println(calculadora.resultadoCalculadora(10, 2));

	}

}
