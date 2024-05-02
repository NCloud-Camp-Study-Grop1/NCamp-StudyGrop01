package homework.homework4.basicWork;

public class PublicOfficial extends Work {

	@Override
	public void workIn() {
		System.out.println("공무원이 회사로 출근합니다.");

	}

	@Override
	public void workOut() {
		System.out.println("공무원이 집으로 퇴근합니다. 그는 9to6의 직장인입니다.");

	}

	@Override
	public void workGood() {
		System.out.println("공무원이 열심히 일합니다.");

	}

}
