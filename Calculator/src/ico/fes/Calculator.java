package ico.fes;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int answer = 0;
		System.out.print("Enter a number: \n");
		int num1 = in.nextInt();
		System.out.print("Enter another number: \n");
		int num2 = in.nextInt();
		System.out.println("Enter tha operand(* / % + -): ");
		char symbol = in.next().charAt(0);
		in.close();
		if (symbol== '*') {
			answer = num1 * num2;
		} else if (symbol== '+'){
			answer = num1 + num2;
		}else if (symbol== '-'){
			answer = num1 - num2;
		}else if (symbol== '%'){
			answer = num1 %num2;
		}else if (symbol== '/'){
			answer = num1 / num2;
		}else {
			System.out.println("Invalid command");
		}
		System.out.println("The result in: " + answer);
	}

}
