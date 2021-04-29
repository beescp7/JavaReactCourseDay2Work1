
public class Student extends User {
	private String studentSeysi;

	public Student(int id, String email, String firstName, String lastName, String identityNumber, String password,
			String studentSeysi) {
		super(id, email, firstName, lastName, identityNumber, password);
		this.studentSeysi = studentSeysi;
	}

	public Student(int id, String email, String firstName, String lastName, String identityNumber, String password) {
		super(id, email, firstName, lastName, identityNumber, password);
	}

	public Student() {

	}

	public String getStudentSeysi() {
		return studentSeysi;
	}

	public void setStudentSeysi(String studentSeysi) {
		this.studentSeysi = studentSeysi;
	}

}
