package algo04;

public class Algo04 {
public static void main(String[] args) {
	// 10진수를 2진수로 변환	19의 정답 10011

		int inputNum = 25;
		int bin[] = new int[100];

		/*
		 * 몫이 0이 될때까지 나눈다. 
		 * 19/2   9...1
		 * 9/2    4...1 
		 * 4/2    2...0 
		 * 2/2    1...0 
		 * 1/2    0...1 
		 * 나머지값을 거꾸로
		 * 읽으면 된다. 
		 * 010011 => 19
		 */

		int i = 0;
		int mok = inputNum;

		while(mok > 0){
			bin[i] = mok % 2;
			mok /= 2;
			i++;
		}
		i--;
		for(;i>=0;i--) {
			System.out.print(bin[i]);
		}
}
}
