package algo01;

import java.util.ArrayList;
import java.util.Scanner;

public class AMainTest01 {

	// 학생정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성.
	// student클래스 생성, string name, no를 가짐 (이름과 학번)
	// 학생들을 ArrayList에 저장한 후, 계속 검색을 하겠느냐 y => 반복,
	// 종료하고 싶으면 n => 프로그램 종료
	// 학생 이름이 있는 경우 그 학생의 학번을 출력
	// 학생 이름이 없으면, 없는 학생이름이라고 출력
	public static void main(String[] args) {
		ATest01 at1 = new ATest01("손오공", "1682");
		ATest01 at2 = new ATest01("사오정", "1412");
		ATest01 at3 = new ATest01("저팔계", "1722");

		ArrayList<ATest01> list = new ArrayList<ATest01>();

		list.add(at1);
		list.add(at2);
		list.add(at3);
		
		for(ATest01 at : list) {
			System.out.println(at.getName() +" " +  at.getNo());
			
		}
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("계속 검색을 원할 경우 y, 죵료를 원하면 n");
			// next는 문자열을 받는다
			String input = sc.next();
			if(input.equals("y")) {
				System.out.println("검색 시작");
				String name = sc.next();
				boolean flag = false;
				
				for(ATest01 at : list) {
					if(at.getName().equals(name)) {
						System.out.println("해당 학생의 학번은 " + at.getNo());
						flag = true;
					
					}
				}
				
				if(!flag) {
					System.out.println("해당하는 학생이름이 없습니다.");
				}
				
			}else if(input.equals("n")) {
				// 가장 가까운 무한루프(while문)에서 탈출하는 것
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}