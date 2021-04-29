
public class Main {

	public static void main(String[] args) {
		User user = new User(1, "x", "x", "x", "x", "x");
		Student student = new Student(2, "y", "y", "y", "y", "y", "y");
		Instructor instructor = new Instructor(3, "z", "z", "z", "z", "z", "z");
		UserManager userManager = new UserManager();
		userManager.addUser(user);
		StudentManager studentManager = new StudentManager();
		studentManager.addUser(student);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor);
	}

}
