package basic.basic03;

public class PublicOfficer extends Labor {

	@Override
	public void goToWork() {
		System.out.println("공무원은 관공서로 출근을 합니다.");
	}

	@Override
	public void goToHome() {
		System.out.println("공무원은 정시퇴근을 합니다.");
	}

	@Override
	public void work() {
		System.out.println("공무원은 관공서에서 일을 합니다.");
	}
}
