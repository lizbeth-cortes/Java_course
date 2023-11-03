package inventory;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product("Peine",1,14,30);
		Product p4 = new Product("Enchinador de pestañas",2,20,25);
		Product p5 = new Product("Máscara de pestañas", 3,23,30);
		Product p6 = new Product("Delineador",4,27,24);
		String letter = "ggJ";
		
		System.out.println("Products");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(letter);
	}

}
