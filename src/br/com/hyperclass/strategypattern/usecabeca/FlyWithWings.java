package br.com.hyperclass.strategypattern.usecabeca;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}

}
