package algo01;

import java.util.ArrayList;
import java.util.Scanner;

public class RemindMain01 {
		// 학생정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성.
		// student클래스 생성, string name, no를 가짐 (이름과 학번)
		// 학생들을 ArrayList에 저장한 후, 계속 검색을 하겠느냐 y => 반복,
		// 종료하고 싶으면 n => 프로그램 종료
		// 학생 이름이 있는 경우 그 학생의 학번을 출력
		// 학생 이름이 없으면, 없는 학생이름이라고 출력
	public static void main(String[] args) {
		
		Remind01 student1 = new Remind01("김가가", "1960");
		Remind01 student2 = new Remind01("안나나", "1990");
		Remind01 student3 = new Remind01("심다다", "1960");
		
		ArrayList<Remind01> list = new ArrayList<Remind01>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속은 y, 중지는 n을 누르시오");
			// sc.next()는 입력할때까지 대기이므로 위치가 중요
			String input = sc.next();
			
			if(input.equals("y")) {
				System.out.println("검색을 시작하겠습니다.");
				String name = sc.next();
				boolean flag = false;

				for(Remind01 e : list) {
					if(name.equals(e.getName())) {
						System.out.println(e.getName() + "님의 학번은 " +e.getNo() + "입니다.");
						flag = true;
					}
					
				}
				if(!flag) {
					System.out.println("학생이 존재하지 않습니다");
					
				}
			}else if(input.equals("n")) {
				System.out.println("검색을 중지하겠습니다.");
				break;
			}
		}

	}

}
