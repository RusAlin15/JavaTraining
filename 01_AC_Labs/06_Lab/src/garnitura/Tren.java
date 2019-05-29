package garnitura;

public class Tren {

	private Vagon[] vagon = new Vagon[15];
	private int numar_vagoane_clasaA = 0;
	private int numar_vagoane_clasaB = 0;
	private int numar_vagoane_marfa = 0;
	private int numar_colete = 0;
	
	public Tren( int numar_vagoane_clasaA, int numar_vagoane_clasaB	) {
		// exemplu daca numar_vagoane_clasaA = 5 si numar_vagoane_clasaB = 5 
		// Trenul va avea si 5 vagoane de tip Marfa
		// Toate trenurile sunt creeate cu 15 vagoane
		
		if((numar_vagoane_clasaA + numar_vagoane_clasaB) <= 15 & numar_vagoane_clasaA <= 15) {
			for(int i = 0 ; i < numar_vagoane_clasaA ; i++) {
				vagon[i] = new ClasaA();
				numar_colete += vagon[i].getCapcitateColete();
			}
			
			for(int i = numar_vagoane_clasaA ; i < (numar_vagoane_clasaA + numar_vagoane_clasaB) ; i++) {
				vagon[i] = new ClasaB();
				numar_colete += vagon[i].getCapcitateColete();
			}
			
			for(int i = (numar_vagoane_clasaA + numar_vagoane_clasaB) ; i < 15 ; i++) {
				vagon[i] = new Marfa();
				numar_colete += vagon[i].getCapcitateColete();
			}
						
		} else {
			System.out.println("ERROR!! A train can have maximum 15 carloads.");
		}
		
	}
	
	
	public int getNumarColete() {
		return numar_colete;
	}
	
	public boolean ifEgal(Tren t1) {
		return (numar_colete == t1.numar_colete);
	}
	
	public void tipuriVagoane() {
		// asa era enuntul;
		for(int i = 0 ; i < 15 ; i++) {
			switch(vagon[i].getCapcitateColete()) {
			
			case 300:
				numar_vagoane_clasaA++;
				break;
			case 400:
				numar_vagoane_clasaB++;
				break;
			case 4000:
				numar_vagoane_marfa++;
				break;
			}
		}
		
		System.out.println("Trenul are in componenta sa " + numar_vagoane_clasaA + " vagoane ClasaA " 
		+ numar_vagoane_clasaB + " vagoane ClasaB si " + numar_vagoane_marfa + " vagoane de marfa.");
	}
	

}
