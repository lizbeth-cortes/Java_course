package curso.java.oracle;

public class StudentTester {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(123,"Mary Smith","99",3.4);

		System.out.println(s2);
		s2.setName("Juana la cubana");
		System.out.println(s2);
		
		System.out.println("----------");
		
		double x = 3.25;
		double y = -4.5;
		int m = 23;
		int n = 9;
		System.out.println(x + m * y - (y + n) * x); //
		System.out.println(m / n + m % n);
		System.out.println(5 * x - n / 5);
		System.out.println(Math.sqrt(Math.sqrt(n)));
		System.out.println((int)x);
		System.out.println(Math.round(y));
		double x1 = 3.25;
		double y1 = -4.5;
		int m1 = 23;
		int n1 = 9;
		System.out.println((int)Math.round(x1) + (int)Math.round(y1));
		System.out.println(m1 + n1);
		System.out.println(1-1-((1-(1-(1-n1)))));
	}

}
