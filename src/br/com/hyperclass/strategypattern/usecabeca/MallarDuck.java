package br.com.hyperclass.strategypattern.usecabeca;

public class MallarDuck extends Duck {

	public MallarDuck() {
		super(new FlyWithWings(), new Quack());
	}

}
