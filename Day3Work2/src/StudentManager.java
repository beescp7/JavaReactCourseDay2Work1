
public class StudentManager extends UserManager {
@Override
public void addUser(User user) {
	System.out.println("student add"+"\t"+user.getLastName());
}
@Override
	public void deleteUser(User user) {
	System.out.println("student delete");
	}
@Override
	public void updateUser(User user) {
	System.out.println("student update");
	}
}
