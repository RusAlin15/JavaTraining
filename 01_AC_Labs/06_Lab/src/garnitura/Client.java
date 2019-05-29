package garnitura;

public class Client {
	
	public static void main(String[] args) {
		Tren tren1 = new Tren(3, 4);
//		Tren tren2 = new Tren(44, 44);
		Tren tren3 = new Tren(6, 6);
		Tren tren4 = new Tren(6,6);
			
		tren1.tipuriVagoane();
		tren3.tipuriVagoane();
		tren4.tipuriVagoane();
		
		if(tren1.ifEgal(tren4))
			System.out.println("Trenurile AU capacitati egale.");
		else
			System.out.println("Trenurile NU au capacitati egale.");
		
		if(tren3.ifEgal(tren4))
				System.out.println("Trenurile AU capacitati egale.");
			else
				System.out.println("Trenurile NU au capacitati egale.");
		
	}
}
