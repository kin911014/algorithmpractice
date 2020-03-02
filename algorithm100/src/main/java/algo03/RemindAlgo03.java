package algo03;

import java.util.Scanner;

public class RemindAlgo03 {
	// 가장 많이 출현한 수를 출력하시오
	// 1 2 2 3 1 4 2 2 4 3 5 3 2
	public static void main(String[] args) {
		// sc 객체 선언
		Scanner sc = new Scanner(System.in);
		
		// inputNo 배열 객체 선언 length는 10
		int [] inputNo = new int[10];
		// 입력값을 inputNo 반복문 설정, sc.nextInt();로 int값 입력시 inputNo[0~9]에 값이 들어간다. 
		for(int i=0; i<inputNo.length;i++) {
			inputNo[i] = sc.nextInt();
		}
		
		// mode배열 length는 10인 배열 선언
		int[] mode = new int[10];
		// 위의 inputNo 값이 mode[]안에 값이 들어가면 mode[]의 값은 1씩 증가한다.
		// ex mode[inputNo[i]] => mode[2] =1(1은 2가 inputNo에 들어간 횟수)
		for(int i=0; i<mode.length; i++) {
			
			mode[inputNo[i]]++;
			System.out.println(mode[i]);
		}
		// mode[] = count
		// modeNo = 들어간 횟수
		int modeNo = 0;
		int modeCnt = 0;
		for(int i=0; i<10; i++) {
			if(mode[i] > modeCnt) {
				modeCnt = mode[i];
				modeNo = i;
			}
		}
		System.out.println("최빈수는" + modeNo + "나온 횟수는" + modeCnt);

	}

}
