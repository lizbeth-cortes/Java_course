package ejemplo.oracle.java;
import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in);
		System.out.print("Ingresa tu nombre: ");
		String name = s.next();
		System.out.print("Ingresa un número:");
		int number = s.nextInt();
		System.out.println(name + ", el número que escribiste fue " + number);
		s.close();
		*/
		int grade  = 99;
		int numerDaysAbsent = 1;
		boolean madeHonorRoll = grade >=88;
		if (madeHonorRoll && numerDaysAbsent==0) {
			System.out.println("You made the Honor Roll");
		}
		else {
			System.out.println("False");
		}
	}

}
