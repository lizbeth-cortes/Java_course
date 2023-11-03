package ico.fes;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numInputs = 0;
		int sum = 0;
		while(numInputs<10) {
			int input = in.nextInt();
			sum+=input;
			numInputs++;
		}
		in.close();
		System.out.println("The sum of those ten numbers is :" + sum);
	}

}
