package problema1;

import java.util.Comparator;

public class MyComparator implements Comparator<Achizitie> {
	@Override
	public int compare(Achizitie o1, Achizitie o2) {

		if (o1 instanceof Alimente & o2 instanceof Alimente) {
			if (o1.getSpecialDate() > o2.getSpecialDate())
				return 1;
			else
				return (o1.getSpecialDate() < o2.getSpecialDate()) ? -1 : 0;
		}

		if (o1 instanceof AparatElectrocasnic & o2 instanceof AparatElectrocasnic) {
			if (o1.getSpecialDate() > o2.getSpecialDate())
				return 1;
			else
				return (o1.getSpecialDate() < o2.getSpecialDate()) ? -1 : 0;
		}

		if (o1.getPretTotal() > o2.getPretTotal())
			return 1;
		else
			return (o1.getPretTotal() < o2.getPretTotal()) ? -1 : 0;
	}

}
