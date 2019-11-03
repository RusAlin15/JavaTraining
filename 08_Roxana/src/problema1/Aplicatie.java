package problema1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aplicatie {

	public static void main(String[] args) {
		List<Achizitie> achizitie = new ArrayList<Achizitie>();

		achizitie.add(new Achizitie("Bliment1", 10, 2.5));
		achizitie.add(new Achizitie("Aliment2", 2, 10.5));
		achizitie.add(new Achizitie("Aliment3", 3, 50));
		achizitie.add(new Achizitie("Aliment4", 5, 100));
		achizitie.add(new Achizitie("Aliment5", 8, 10));
		achizitie.add(new Achizitie("Aparat1", 1, 500));
		achizitie.add(new Achizitie("Aparat2", 3, 200));
		achizitie.add(new Achizitie("Aparat1", 4, 250));
		achizitie.add(new Achizitie("Aparat1", 3, 210.5));
		achizitie.add(new Achizitie("Aparat1", 2, 600));

		Collections.sort(achizitie, new MyComparator());
		System.out.println(achizitie.toString());
	}

}
