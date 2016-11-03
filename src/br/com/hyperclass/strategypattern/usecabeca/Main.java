package br.com.hyperclass.strategypattern.usecabeca;


/**
 * Padrão Strategy
 * 
 * Principio basicos:
 * 
 *  - Principio 1:
 *  	Indentifique os aspectos de seu aplicativo que variam e
 *  	separe-os do que permanece igual
 *  
 *  - Principio 2:
 *  	Progama para um interface, nao uma implementacao
 *  
 *  - Principio 3:
 *  	Dar prioridade a composicao
 *  
 *  Principio basico da orientacao a objetos:
 *  	Encapsule o que varia.
 *  	De prioridade a composicao em relacao a heranca
 *  	Progame para interface, nao para implementacoes
 * 
 * 
 * */
public class Main {

	public static void main(String[] args) {
		
		Duck mallard = MallarDuck.valeOfMallarDuck(new FlyWithWings(), new Quack());
		mallard.perfomQuack();
		mallard.perfomFly();

	}

}
