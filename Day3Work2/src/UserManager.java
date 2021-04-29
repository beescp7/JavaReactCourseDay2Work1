
public class UserManager {
 public void addUser(User user)
 {
	System.out.println("usermanager add"+"\t"+user.getEmail()+user.getPassword()); 
 }
 public void deleteUser(User user)
 {
	 System.out.println("usermanager delete"); 
 }
 public void updateUser(User user)
 {
	 System.out.println("usermanager update"); 
 }
}
