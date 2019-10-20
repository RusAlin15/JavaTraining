import java.util.ArrayList;
import java.util.List;

public abstract class Project implements Risky {
	private String title;
	private String purpose;
	protected int membersNr;
	private Manager manager;
	private long founds;
	protected List<Memberr> members = new ArrayList<>();

	public Project(String title, String purpose, long founds, Manager managerName) {
		super();
		this.title = title;
		this.purpose = purpose;
		this.founds = founds;
		this.manager = managerName;
		this.membersNr = 1;
	}

	public abstract void addMember(Memberr member) throws ToManyMembersException;

	public abstract double getRisk();

	public long getFounds() {
		return founds;
	}

	public int getMembersNr() {
		return membersNr;
	}

	@Override
	public String toString() {
		return "Project title: " + title + ", purpose: " + purpose + ", founds: " + getFounds() + ", membersNr: "
				+ getMembersNr() + ", Manager: " + manager;
	}
}
