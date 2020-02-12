package algo02;
// 피보나치 수열
// a의 n승 = a의n승의-1 + a의n승의 -2
// 1 1 2 3 4 8 13 21 34...
public class Main {
	public static void main(String[] args) {
		
		int [] arr = new int[100];
		
		// An = An-1 + An-2; n>=3
		// a1 - 1, a2 = 1 (첫번째 두번째자리는 무조건 1이 될 수 밖에 없다. 3번째항을 구하는 공식이기때문)
		
		// 첫번째 방법
		arr[1]=1;
		arr[2]=1;
		for(int i=3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		for(int i=1; i<10; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		// 두번째 방법
		int prevPrevNo = 1; // An-2
		int prevNo = 1; // An-1
		
		System.out.print(prevPrevNo + " ");
		System.out.print(prevNo + " ");
		
		for(int i=3; i<=10; i++) {
			int nNo = prevPrevNo + prevNo;
			System.out.print(nNo + " ");
			
			prevPrevNo = prevNo; 
			prevNo = nNo;
		}
		
		
	}
}
