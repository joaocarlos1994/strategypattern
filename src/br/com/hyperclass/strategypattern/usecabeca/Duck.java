package br.com.hyperclass.strategypattern.usecabeca;

public abstract class Duck {
	
	private final FlyBehavior flyBehavior;
	private final QuackBehavior quackBehavior;
	
	public Duck(final FlyBehavior flyBehavior, final QuackBehavior quackBehavior) {
		super();
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
	
	public void perfomFly() {
		flyBehavior.fly();
	}
	
	public void perfomQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys");
	}
	
}
