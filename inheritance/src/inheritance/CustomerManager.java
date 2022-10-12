package inheritance;

public class CustomerManager extends PersonManager {
	public void Remove() {
		System.out.println("Silindi");
	}

	public void Delete() {
		System.out.println("Güncellendi");
	}
}
