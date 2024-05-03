package chap99_homework.homework04;

import java.util.Iterator;
import java.util.Scanner;

public class UseOfEmplyee {

	public static void main(String[] args) {
		Employee[] empArr = new Employee[100];
		
		
		
		int eno;
		String name;
		int pay;
		int bonus;
		int hireYear;
		int workDay;
		int index = 0;
		
		while (true) {
			
			
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 정규직 저장");
			System.out.println("2. 임시직 저장");
			System.out.println("3. 계약직 저장");
			System.out.println("4. 전체 사원 정보 출력");
			System.out.println("5. 월급 계산 출력");
			System.out.println("6. 프로그램 종료");
			System.out.println(" ");
			System.out.print("입력 : ");
			
			Scanner sc = new Scanner(System.in);
			int menuSelect = sc.nextInt();
			String userInput = sc.nextLine();
			
			if(menuSelect == 1) {
				empArr[index++] = generateEmployee(sc, menuSelect);
//				System.out.println("*** 정규직 저장 ***");
//				System.out.println("사번을 입력하세요.");
//				eno = sc.nextInt();
//				sc.nextLine(); // 개행이 씹혀서 
//				System.out.println("이름을 입력하세요.");
//				name = sc.nextLine();
//				System.out.println("급여를 입력하세요.");
//				pay = sc.nextInt();
//				System.out.println("보너스를 입력하세요.");
//				bonus = sc.nextInt();
//				empArr[index++] = new RegularEmployee(eno, name, pay, userNum, bonus);
//				// 인덱스 0번째에 emp가 다 들어감
//				System.out.println("저장되었습니다.");
//				System.out.println("");
			}
			
//			-------------------------------------------
			
			else if(menuSelect == 2) {
				empArr[index++] = generateEmployee(sc, menuSelect);
//				System.out.println("");
//				System.out.println("*** 임시직 저장 ***");
//				System.out.println("사번을 입력하세요.");
//				eno = sc.nextInt();
//				sc.nextLine();
//				System.out.println("이름을 입력하세요.");
//				name = sc.nextLine();
//				System.out.println("급여를 입력하세요.");
//				pay = sc.nextInt();
//				System.out.println("근무년수를 입력하세요.");
//				hireYear = sc.nextInt();
//				empArr[index++] = new TempEmployee(eno, name, pay, userNum, hireYear);
//				// 인덱스 1번째에 emp가 다 들어감
//				System.out.println("저장되었습니다.");
//				System.out.println("");
			}
			
//			-------------------------------------------
			
			else if(menuSelect == 3) {
				empArr[index++] = generateEmployee(sc, menuSelect);
//				System.out.println("");
//				System.out.println("*** 계약직 저장 ***");
//				System.out.println("사번을 입력하세요.");
//				eno = sc.nextInt();
//				sc.nextLine(); // 개행이 씹혀서 
//				System.out.println("이름을 입력하세요.");
//				name = sc.nextLine();
//				System.out.println("급여를 입력하세요.");
//				pay = sc.nextInt();
//				System.out.println("근무일수를 입력하세요.");
//				workDay = sc.nextInt();
//				empArr[index++] = new ContractEmployee(eno, name, pay, userNum, workDay);
//				// 인덱스 2번째에 emp가 다 들어감
//				System.out.println("저장되었습니다.");
//				System.out.println("");
			}
			
//			-------------------------------------------
			else if(menuSelect == 4) {
				System.out.println("");
				System.out.println("전체 사원의 정보를 출력합니다. ");
				System.out.println("");
				empArr[0].showEmployeeInfo();
				System.out.println("------------------");
				empArr[1].showEmployeeInfo();
				System.out.println("------------------");
				empArr[2].showEmployeeInfo();
				System.out.println("");
			}
			
			else if(menuSelect == 5) {
				System.out.println("****************************");
				System.out.println("월급 계산 출력 메뉴에 들어오셨습니다.");
				while (true) {
					System.out.println("");
					System.out.print("검색할 사원의 사번을 입력하세요. (4 입력 시 종료) : ");
					menuSelect = sc.nextInt();
					if(menuSelect == 1) {
						System.out.println("");
						System.out.println("사번 " + menuSelect + "번의 사원 정보를 출력합니다.");
						empArr[0].showEmployeeInfo();
					}
					else if(menuSelect == 2) {
						System.out.println("사번 " + menuSelect + "번의 사원 정보를 출력합니다.");
						empArr[1].showEmployeeInfo();
					}
					else if(menuSelect == 3) {
						System.out.println("사번 " + menuSelect + "번의 사원 정보를 출력합니다.");
						empArr[2].showEmployeeInfo();
					}
					else if(menuSelect == 4) {
						System.out.println("메뉴로 돌아갑니다 . . .");
						System.out.println("");
						break;
					}
					else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}
				}
			}
			
			else if(menuSelect == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.println("");
			}
		}

	}

	public static Employee generateEmployee(Scanner sc, int menuSelect) {
	
		System.out.println("사번을 입력하세요.");
		int eno = sc.nextInt();
		sc.nextLine(); // 개행이 씹혀서 
		
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("급여를 입력하세요.");
		int pay = sc.nextInt();

		System.out.println("저장되었습니다.");
		System.out.println("");
		
		if(menuSelect == 1) {
			System.out.println("보너스를 입력하세요.");
			int bonus = sc.nextInt();
			
			return new RegularEmployee(eno, name, pay, menuSelect, bonus);
		} else if(menuSelect == 2) {
			System.out.println("근무년수를 입력하세요.");
			int hireYear = sc.nextInt();
			
			return new TempEmployee(eno, name, pay, menuSelect, hireYear);
		}
		else {
			System.out.println("근무일수를 입력하세요. ");
			int workDay = sc.nextInt();
			
			return new ContractEmployee(eno, name, pay, menuSelect, workDay);
		}
	}
	
	
}
