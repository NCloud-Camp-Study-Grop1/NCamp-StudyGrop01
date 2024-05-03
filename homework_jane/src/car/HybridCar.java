package car;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("속도올린다.");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("속도내린다.");

	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("연료충전.");

	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("전기충전");

	}

}
