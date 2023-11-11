package ico.fes;

import java.util.Scanner;

public class ArregloBidimensional {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] nums = new int[3][2];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.println("Enter a value for row: " + i + " column: " + j);
				nums[i][j]=in.nextInt();
			}
		}
		in.close();
		int n=0;
		for (int i = 0;  i < nums.length; ++i) {
			for (int j = 0; j < nums[i].length; j++) {
				n = nums[i][j];
				System.out.print(n);
			}
			System.out.print("\n");
		}
		
	}
	
}
