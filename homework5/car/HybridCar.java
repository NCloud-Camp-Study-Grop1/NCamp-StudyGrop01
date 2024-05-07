package homework.homework5.car;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		System.out.println("스피드를 올립니다.");

	}

	@Override
	public void speedDown() {
		System.out.println("스피드를 내립니다.");

	}

	@Override
	public void addFuel() {
		System.out.println("연료를 추가합니다.");

	}

	@Override
	public void charge() {
		System.out.println("기어를 바꿉니다.");

	}

}
