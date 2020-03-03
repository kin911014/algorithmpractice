package algo04;

public class RemindAlgo04 {
	// 10진수를 2진수로 변환	19의 정답 10011
	public static void main(String[] args) {
		
		int inputNo = 20;
		int bin[] = new int[100];
		
		int mok = inputNo;
		int i = 0;
		while(mok > 0) {
			bin[i] = mok%2;
			mok /= 2;
			System.out.print(bin[i]);
			i++;
			
		}
		i--;
		System.out.println();
		for(; i>=0; i--) {
			System.out.print(bin[i]);
		}
		
		/*
		 * 19/2    9...1
		 * 9/2     4...1
		 * 4/2     2...0
		 * 2/2     1...0
		 * 1/2     0...1
		 * 
		 * 10011
		 * */

	}

}
