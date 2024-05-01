package homework;

import java.util.Random;
import java.util.Scanner;

public class RockScissPaper {
	
	private static Scanner sc = new Scanner(System.in);

	private static Random rd = new Random();

	private static boolean isExit = false;

	private static int gameCnt = 0;

	private static int winCnt = 0;

	private static int drawCnt = 0;

	private static int loseCnt = 0;
	
	

	
	public static void main (String[] args) {
		System.out.println("가위바위보 시뮬레이션을 시작합니다.");
		
		int stop = 0;
		int temp = 0;
		int usertemp = 0;
		
		while(true) {
			temp = rd.nextInt(3);
			System.out.print("0=가위 1=바위 2=보 3=멈춤 : ");
			usertemp = sc.nextInt();
			if( usertemp == 3 ) {
				break;
			}
			if(usertemp == 0) {
				if(temp == 0) {
					++drawCnt;
				}
				else if(temp == 1) {
					++loseCnt;
				}
				else {
					++winCnt;
				}
			}
			else if(usertemp == 1) {
				if(temp == 0) {
					++winCnt;
				}
				else if(temp == 1) {
					++drawCnt;
				}
				else {
					++loseCnt;
				}
			}
			else {
				if(temp == 0) {
					++winCnt;
				}
				else if(temp == 1) {
					++loseCnt;
				}
				else {
					++drawCnt;
				}
			}
			
			
		}
		
		System.out.println(gameCnt+"전"+winCnt+"승"+drawCnt+"무"+loseCnt+"패");
		
	}
}

