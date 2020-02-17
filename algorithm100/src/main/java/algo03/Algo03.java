package algo03;

import java.util.Scanner;

// 가장 많이 출현한 수를 출력하시오
// 1 2 2 3 1 4 2 2 4 3 5 3 2
public class Algo03 {
	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		
//		int[] inputArr = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2};
//		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		
//		int[] sameArr = {};
//		for (int i=0; i<=arr.length; i++) {
//			for(int j=0; j<=inputArr.length; j++) {
//				if(arr[i] == inputArr[j]) {
//					
////					al.add(arr[i]=inputArr[j]);
//					System.out.println(arr[i]=inputArr[j]);
//				}
//			}
//		}
	
		Scanner sc = new Scanner(System.in);
		int[] inputNo = new int [10];
		for(int i=0; i<inputNo.length; i++) {
			inputNo[i] = sc.nextInt();
		}
		
		// index = 출현한 수
		// index value = 몇번 나왔는지 저장하는 용도
		// ex/ mode[2] = 3에서 index 2는 최빈수이며, 3번출현했다는 의미
		int[] mode = new int[10];
		for(int i=0; i<10; i++) {
			mode[inputNo[i]]++;
			System.out.println(mode[i]);
		}
		
		
		int modeNo = 0; // 최빈수
		int modeCnt = 0; // 최빈수가 나온 횟수
		for(int i=0; i<10; i++) {
			if(modeCnt<mode[i]) {
				modeCnt = mode[i];
				modeNo = i;
			}
		}
		
		System.out.println("최빈수는 " + modeNo + "나온 횟수는 "+modeCnt);
		
		
	}
}
