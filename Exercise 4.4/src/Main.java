
public class Main {

	public static void main(String[] args) {
		
		Mango m = new Mango("Mango",4.99, 150); //new object for super class
		System.out.println(m);
		System.out.println(); 
		
		Durian g = new Durian("Durian", "Boost Heart Health", 0.5, 13.5);
		System.out.println(g);
		System.out.println();
		
		MusangKing mk = new MusangKing("Musang King", "Delicious", 3.5, 35.5, "Yellow", "Oval"); //new object for sub class
		System.out.println(mk);
		System.out.println();
		
		yellowMango ym = new yellowMango("Harum Manis Mango", 2.50, 20, "Green", "Oval"); //new object for sub class
		System.out.println(ym);
		
		
		
		
	}

}
