package basic;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		System.out.println("가속합니다.");
	}

	@Override
	public void speedDown() {
		System.out.println("감속합니다.");
	}

	@Override
	public void addFuel() {
		System.out.println("차량에 휘발유를 넣습니다.");
	}

	@Override
	public void charge() {
		System.out.println("차량에 배터리를 충전합니다.");
	}

}
