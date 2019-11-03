package problema1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aplicatie {

	public static void main(String[] args) {
		List<Achizitie> aparate = new ArrayList<Achizitie>();
		List<Achizitie> alimente = new ArrayList<Achizitie>();
		List<Achizitie> achizitii = new ArrayList<Achizitie>();

		Achizitie ap1 = new AparatElectrocasnic("Achizitie", 2, 10.5, 2);
		Achizitie ap2 = new AparatElectrocasnic("Achizitie", 3, 50, 5);
		Achizitie ap3 = new AparatElectrocasnic("Achizitie", 5, 100, 4);
		Achizitie ap4 = new AparatElectrocasnic("Achizitie", 3, 210.5, 2);
		Achizitie ap5 = new AparatElectrocasnic("Achizitie", 2, 600, 1);

		aparate.add(ap1);
		aparate.add(ap2);
		aparate.add(ap3);
		aparate.add(ap4);
		aparate.add(ap5);
		Collections.sort(aparate, new MyComparator());

		Achizitie al1 = new Alimente("Alimente", 10, 2.5, 2);
		Achizitie al2 = new Alimente("Alimente", 8, 10, 7);
		Achizitie al3 = new Alimente("Alimente", 1, 500, 5);
		Achizitie al4 = new Alimente("Alimente", 3, 200, 4);
		Achizitie al5 = new Alimente("Alimente", 4, 250, 8);

		alimente.add(al1);
		alimente.add(al2);
		alimente.add(al3);
		alimente.add(al4);
		alimente.add(al5);
		Collections.sort(alimente, new MyComparator());

		achizitii.add(ap2);
		achizitii.add(al4);

		Collections.sort(achizitii, new MyComparator());

		System.out.println("Aparate sortate dupa garantie " + System.lineSeparator() + aparate);
		System.out.println();
		System.out.println("Alimente sortate dupa data de expirare " + System.lineSeparator() + alimente);
		System.out.println();
		System.out.println("Achizitii sortate dupa pret " + System.lineSeparator() + achizitii);
	}

}
