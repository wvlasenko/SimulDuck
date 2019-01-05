package proj;

public class DecoyDuck {
	QuackBehavior quackBehavior;

	public void performQuack() {
		quackBehavior.quack();

	}

	public DecoyDuck() {
		quackBehavior = new Squeak();

	}

	public void display() {
		System.out.println("I'm Decoy duck");
	}

}