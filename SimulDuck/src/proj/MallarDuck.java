package proj;

public class MallarDuck extends Duck {
	public MallarDuck() {
		quackBehavior = new Quack();
		flybehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallar duck");
	}
}
