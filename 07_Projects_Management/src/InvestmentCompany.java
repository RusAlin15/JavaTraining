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

		Project comercial = new ComercialProject("Comercial", "Comert Public", 4000, managerComercial, "12.12.2020");
		try {
			comercial.addMember(member1);
			comercial.addMember(member6);
			comercial.addMember(member4);
			comercial.addMember(member1);
			comercial.addMember(member6);
			comercial.addMember(member4);
			comercial.addMember(member1);
			comercial.addMember(member6);
			comercial.addMember(member4);
			comercial.addMember(member1);
			comercial.addMember(member6);
			comercial.addMember(member4);
			comercial.addMember(member1);
			comercial.addMember(member6);
		} catch (ToManyMembersException e) {
			System.out.println("Error! To many members aded.");
		}
		System.out.println(comercial);
	}
}
