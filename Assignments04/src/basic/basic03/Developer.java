package basic.basic03;

public class Developer extends Labor {

	@Override
	public void goToWork() {
		System.out.println("개발자는 회사로 출근합니다.");
	}

	@Override
	public void goToHome() {
		System.out.println("개발자는 마감에 쫓겨 퇴근하지 못합니다.");
	}

	@Override
	public void work() {
		System.out.println("개발자는 코딩을 합니다.");
	}
}
