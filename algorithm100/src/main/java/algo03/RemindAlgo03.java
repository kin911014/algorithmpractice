package algo03;

import java.util.Scanner;

public class RemindAlgo03 {
	// 가장 많이 출현한 수를 출력하시오
	// 1 2 2 3 1 4 2 2 4 3 5 3 2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] inputNo = new int[10];
		for(int i=0; i<inputNo.length;i++) {
			inputNo[i] = sc.nextInt();
			
		}
		
		int[] mode = new int[10];
		for(int i=1; i<mode.length; i++) {
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
