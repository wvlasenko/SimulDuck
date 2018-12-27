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

	public void setFlybehavior(FlyBehavior fb) {
		flybehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
