package proj;

public abstract class Duck {
	FlyBehavior flybehavior;
	QuackBehavior quackBehavior;

	public Duck() {

	}

	public abstract void display();

	public void performFly() {
		flybehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All duck float, even decoys");
	}
}
