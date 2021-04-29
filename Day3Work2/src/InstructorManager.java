
public class InstructorManager extends UserManager {
	@Override
	public void addUser(User user) {
		System.out.println("Instructor add "+"\t"+user.getFirstName());
	}
	@Override
		public void deleteUser(User user) {
		System.out.println("Instructor delete");
		}
	@Override
		public void updateUser(User user) {
		System.out.println("Instructor update");
		}
}
