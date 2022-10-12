package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Lenova", "Lenova Laptop", 3000, 5);
		ProductManager productManager = new ProductManager();
		productManager.Add(product1);
		System.out.println(product1.getName());
	}

}
