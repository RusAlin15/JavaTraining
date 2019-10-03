import java.util.ArrayList;
import java.util.List;

public class InvestmentCompany {
	private List<Project> projects = new ArrayList<>();

	public static void main(String args[]) {

		Manager managerComercial = new Manager("Alex", 12);
		Memberr member1 = new Memberr("Mihai", 45);
		Memberr member2 = new Memberr("Sorin", 54);
		Memberr member3 = new Memberr("Ion", 62);
		Memberr member4 = new Memberr("Deju", 42);
		Memberr member5 = new Memberr("Valer", 24);
		Memberr member6 = new Memberr("Sorina", 52);

		Project comercial = new ComercialProject("Comercial", "Comert Public", 3000, managerComercial, "12.12.2020");
		comercial.addMember(member1);
		System.out.println(comercial);
		System.out.println(comercial.getRisk());
	}
}
