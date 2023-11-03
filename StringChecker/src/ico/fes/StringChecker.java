package ico.fes;
import java.util.*;

public class StringChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String name = "";
		System.out.print("Enter your name: ");
		name = in.nextLine();
		in.close();
		if(name.equals("Elvis"))
			System.out.println("You're tha king of Rock and Roll");
		else if(name.equals("Michael Jackson"))
			System.out.println("You're the king of pop");
		else
			System.out.println("You're not the king");
	}
	

}
