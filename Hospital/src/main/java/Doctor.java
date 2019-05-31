
public class Doctor extends Staff{
	private String consultant;
	private boolean cons;

	public Doctor(boolean cons, String name, String title) {
		super(name, title);
		this.cons = cons;
	}

	public String getConsultant() {
		return consultant;
	}

	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}

	public boolean isCons() {
		return cons;
	}

	public void setCons(boolean cons) {
		this.cons = cons;
	}

}
