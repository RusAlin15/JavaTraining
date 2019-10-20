
public class ComercialProject extends Project {
	private String deadline;
	private long marketFounds;
	private int teamNr = 0;
	private int maximumMembers = 15;

	public ComercialProject(String title, String purpose, long founds, Manager managerName, String deadline) {
		super(title, purpose, founds, managerName);
		this.deadline = deadline;
		this.marketFounds = founds / 2;
		teamNr++;
	}

	@Override
	public void addMember(Memberr member) throws ToManyMembersException {
		if (getMembersNr() >= maximumMembers) {
			throw new ToManyMembersException();
		} else {
			members.add(member);
			membersNr++;
		}
	}

	@Override
	public double getRisk() {
		double risk = ((double) teamNr * 3 / this.getMembersNr())
				/ ((this.getFounds() * 0.00001) - (marketFounds * 0.00003));
		System.out.println(teamNr);
		return risk;

	}
}
