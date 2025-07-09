package entity;

public class player {
	public player(int pid, int jn, int runs, int wickets, String pname, String tname) {
		super();
		this.pid = pid;
		this.jn = jn;
		this.runs = runs;
		this.wickets = wickets;
		this.pname = pname;
		this.tname = tname;
	}
	int pid;
	int jn;
	int runs;
	int wickets;
	String pname;
	String tname;
	@Override
	public String toString() {
		return "player [pid=" + pid + ", jn=" + jn + ", runs=" + runs + ", wickets=" + wickets + ", pname=" + pname
				+ ", tname=" + tname + "]";
	}
	

}
