package br.com.hyperclass.strategypattern.usecabeca;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
