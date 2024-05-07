package prac_space;

import java.util.Random;
import java.util.Scanner;

public class baseball {

	// 1. 컴퓨터가 0~9 까지 숫자중 랜던한 값 3개를 배열에 저장(중복불가능)
	// 2. 사용자가 0~9까지 숫자 세개 입력(중복불가능)
	// 3. 사용자가 입력한 숫자 중 컴퓨터가 가지고 있는 숫자와 같은 숫자면서 위치가 다르면 볼로 판단
	// 4. 사용자가 입력한 숫자 중 컴퓨터가 가지고 있는 숫자와 같은 숫자면서 위치가 같으면 스트라이크로 판단
	// com {1, 2, 3} user {1, 3, 5} ==> 1스트라이크 1볼
	// com {1, 2, 3} user {4, 5, 6} ==> 0스트라이크 0볼
	// com {1, 2, 3} user {2, 3, 1} ==> 0스트라이크 3볼
	// com {1, 2, 3} user {1, 2, 3} ==> 3스트라이크 아웃 게임종료
	
	
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	
	int[] userNum = new int[3]; 
	int[] comNum = new int[3];


		//컴퓨터 랜덤 숫자3
	for(int i = 0 ; i < 3 ; i++) {
		comNum[i] = random.nextInt(9)+1;
		
		if(i > 0) {
		for(int j = 0 ; j < i ; j++) {
			if(comNum[i] == comNum[j]) {
				i--;
				break;
				}
			
			}
		}
	}
	
	//사용자 입력값
	
	while(true) {
		
		int ball = 0;
		int strike = 0;	
		
		for(int i : comNum) {
			System.out.println(i);
		}
		
		//사용자 값 입력 , 중복 체크
		
		for(int i = 0 ; i < userNum.length ; i++) {
			System.out.println("0~9중 숫자 하나를 입력해주세요.");
			userNum[i] = sc.nextInt();
				if(userNum[i] < 0  || userNum[i] > 9) {
					System.out.println("잘못입력하셨습니다. 0~9사이의 숫자로 입력해주세요.");
					i--;
					continue;
				} 
				
				if(i > 0){
					for(int j =0; j < i; j++) {
						if(userNum[i] == userNum[j]) {
							System.out.println("중복된 값이 있습니다. 다시입력하세요.");
							i--; 
							break;
						}
					}
				}
			}
		
		//사용자 입력 값 확인
		
		for(int i : userNum) {
			System.out.println(i);
		}	
		System.out.println();
		
		
		//배열비교. 스트라잌. 
		for(int i = 0; i < userNum.length; i++) {
			for(int j = 0; j < comNum.length; j++) {
			if(userNum[i] == comNum[j]) {
				if(i == j ) {
					strike++;
				} else {
					ball++;
				
				}
			}
		}
	}
		if(strike == 3 ) {
			System.out.println("3스트라이크 아웃. 게임을 종료합니다.");
			break;
		}else {syso
	



}



