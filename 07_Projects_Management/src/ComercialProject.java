
public class ComercialProject extends Project {
	private String deadline;
	private long marketFounds;
	private int teamNr;

	public ComercialProject(String title, String purpose, long founds, Manager managerName, String deadline) {
		super(title, purpose, founds, managerName);
		this.deadline = deadline;
		this.marketFounds = founds / 2;
		this.teamNr++;
	}

	@Override
	public double getRisk() {
		double risk = (teamNr * 3 / getMembersNr()) / ((getFounds() * 0.00001) - (marketFounds * 0.00003));
		return risk;
	}

}
