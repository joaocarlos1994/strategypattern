package br.com.hyperclass.strategypattern.usecabeca;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
