
public class Instructor extends User {
	private String instructorSeysi;

	public Instructor(int id, String email, String firstName, String lastName, String identityNumber, String password,
			String instructorSeysi) {
		super(id, email, firstName, lastName, identityNumber, password);
		this.instructorSeysi = instructorSeysi;
	}

	public Instructor(int id, String email, String firstName, String lastName, String identityNumber, String password) {
		super(id, email, firstName, lastName, identityNumber, password);
	}

	public Instructor() {

	}

	public String getInstructorSeysi() {
		return instructorSeysi;
	}

	public void setInstructorSeysi(String instructorSeysi) {
		this.instructorSeysi = instructorSeysi;
	}

}
