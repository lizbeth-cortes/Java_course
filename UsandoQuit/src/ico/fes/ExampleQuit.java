package ico.fes;

import java.util.Scanner;

public class ExampleQuit {

	public static void main(String[] args) {
		boolean quit = false;
		int num1 = 10, num2 = 6, answer = 0;
		char operand = ' ' ;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Please enter a mathematical operand");
			String input = in.next();
			operand = input.charAt(0);
			switch (operand) {
				case '*' -> answer = num1*num2;
				case '+' -> answer = num1 +num2;
				case '-' -> answer = num1 - num2;
				case '/' -> answer = num1/num2;
				default -> throw new IllegalArgumentException("Invalid input: " + operand);
			}
			System.out.println("Quit? Y/N");
			//equalsIgnoreCase() - Compara dos strings para ver si 
			//son iguales ignorando las diferencias entre mayúsculas y minúsculas. 
			if (in.next().equalsIgnoreCase("Y"))
				quit = true;
		}while(!quit);
		

	}	

}
