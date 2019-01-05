package proj;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallarDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlybehavior(new FlyRocketPowered());
		model.performFly();
		model.performQuack();
		DecoyDuck decoy = new DecoyDuck ();
		decoy.display();
		decoy.performQuack();

	
	}
}
