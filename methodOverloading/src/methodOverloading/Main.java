package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc1 = dortIslem.topla(2, 6);
		int sonuc2 = dortIslem.topla(4, 6, 2);
		System.out.println(sonuc1);
		System.out.println(sonuc2);
	}

}
