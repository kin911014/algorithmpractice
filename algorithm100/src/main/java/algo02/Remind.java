package algo02;
//피보나치 수열
//a의 n승 = a의n승의-1 + a의n승의 -2
//1 1 2 3 5 8 13 21 34 ...
public class Remind {
	public static void main(String[] args) {
		
		// An = An-1 + An-2; n>=3
		// a1 - 1, a2 = 1 (첫번째 두번째자리는 무조건 1이 될 수 밖에 없다. 3번째항을 구하는 공식이기때문)
		
//		int [] arr = new int[100];
//		
//		arr[1] = 1;
//		arr[2]= 1;
//		
//		for(int i=3; i<=10; i++) {
//			arr[i] = arr[i-1] + arr[i-2];
//		}
//		for(int i=1; i<=10; i++ ) {
//			System.out.print(arr[i] + " ");
//		}
	
	
	
	
	//피보나치 수열
	//a의 n승 = a의n승의-1 + a의n승의 -2
	//1 1 2 3 5 8 13 21 34 ...
	
	int[] arr = new int[100];
	int i;
	
	arr[1]= 1;
	arr[2]= 2;
	
	for(i=3; i<=10; i++) {
		
		arr[i] = arr[i-1] + arr[i-2];
	}
	for(i=1; i<=10; i++) {
		System.out.print(arr[i] + " ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
}
