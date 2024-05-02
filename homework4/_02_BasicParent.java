package homework.homework4;

import homework.homework4.basicParent.ChildA;
import homework.homework4.basicParent.ChildB;
import homework.homework4.basicParent.Parent;

public class _02_BasicParent {

	public static void main(String[] args) {
		Parent childA = new ChildA("김", "O형", 178, "쿨톤", "아무개");
		
		childA.inFo();
		
		System.out.println("--------------------------");
		
		Parent childB = new ChildB("김", "A형", 165, "웜톤", "있음");
		
		childB.inFo();
	}

}
