package proj;

public class MallarDuck extends Duck {
	public MallarDuck() {
		quackBehavior = new Quarck();
		flybehavior = new FlyWithWings();
	}
public void display() {
	System.out.println("I'm a real Mallar duck");
}
}
