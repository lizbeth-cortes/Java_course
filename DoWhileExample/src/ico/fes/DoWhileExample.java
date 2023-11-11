package ico.fes;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int repeat = 0, input = 0, sum = 0;
		do{
			System.out.print("Enter a number:");
			input = in.nextInt();
			sum+=input;
			System.out.print("Do you want to enter another number: ");
			System.out.println("Enter 1 for yes or 2 for no: ");
			repeat = in.nextInt();
		}while(repeat==1); 
		in.close();
		System.out.println("The sum of those ten numbers is :" + sum);

	}

}
