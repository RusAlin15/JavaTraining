import java.util.ArrayList;
import java.util.List;

public abstract class Project implements Risky {
	private String title;
	private String purpose;
	private long founds;
	private int membersNr = 0;
	private Manager manager;
	private List<Memberr> members = new ArrayList<>();

	public Project(String title, String purpose, long founds, Manager managerName) {
		super();
		this.title = title;
		this.purpose = purpose;
		this.founds = founds;
		this.manager = managerName;
		membersNr++;
	}

	@Override
	public String toString() {
		return "Project title=" + title + ", purpose=" + purpose + ", founds=" + getFounds() + ", membersNr="
				+ getMembersNr() + ", Manager: " + manager + ", members=" + members;
	}

	public void addMember(Memberr member) {
		members.add(member);
	}

	public long getFounds() {
		return founds;
	}

	public int getMembersNr() {
		return membersNr;
	}

	public abstract double getRisk();
}
