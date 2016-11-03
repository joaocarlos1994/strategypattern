package br.com.hyperclass.strategypattern.usecabeca;

public class MallarDuck extends Duck {

	private MallarDuck(final FlyBehavior flyBehavior, final QuackBehavior quackBehavior) {
		super(new FlyWithWings(), new Quack());
	}
	
	public static MallarDuck valeOfMallarDuck(final FlyBehavior flyBehavior, final QuackBehavior quackBehavior){
		return new MallarDuck(flyBehavior, quackBehavior);
	}

}
