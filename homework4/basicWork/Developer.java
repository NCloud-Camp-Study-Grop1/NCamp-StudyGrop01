package homework.homework4.basicWork;

public class Developer extends Work {

	@Override
	public void workIn() {
		System.out.println("개발자가 회사로 출근합니다.");
	}

	@Override
	public void workOut() {
		System.out.println("개발자는 오늘도 퇴근하지 못했습니다...");
	}

	@Override
	public void workGood() {
		System.out.println("개발자가 열심히 일합니다.");
	}

}
