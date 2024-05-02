package homework.homework4;

import homework.homework4.basicWork.Developer;
import homework.homework4.basicWork.PublicOfficial;
import homework.homework4.basicWork.Work;

public class _03_BasicWork {

	public static void main(String[] args) {
		Work work = new Developer();
		
		work.workIn();
		work.workOut();
		work.workGood();
		
		System.out.println("------------------------");
		
		work = new PublicOfficial();
		
		work.workIn();
		work.workOut();
		work.workGood();

	}

}
