package problema1;

import java.util.Comparator;

public class MyComparator implements Comparator<Achizitie> {
	@Override
	public int compare(Achizitie o1, Achizitie o2) {
		if (o1.getPretTotal() > o2.getPretTotal())
			return 1;
		else
			return (o1.getPretTotal() < o2.getPretTotal()) ? -1 : 0;
	}

	public int compare(Alimente o1, Alimente o2) {
		if (o1.getPretTotal() > o2.getPretTotal())
			return 1;
		else
			return (o1.getPretTotal() < o2.getPretTotal()) ? -1 : 0;
	}
}
