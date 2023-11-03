package ico.fes;
import java.util.*;

public class ClassYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What grade are you in?");
		int grade = in.nextInt();
		in.close();
		switch(grade) {
		case 9 -> System.out.println("You're a freshman");
		case 10 -> System.out.println("Youre a sophomore");
		case 11 -> System.out.println("You're a junior");
		case 12 -> System.out.println("You're a senior");
		default -> System.out.println("Invalid grade");
		}
	}

}
