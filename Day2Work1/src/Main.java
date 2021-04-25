
public class Main {

	public static void main(String[] args) {
		
       Course course1=new Course(1,"java","engin","xx",0.0);
       Course course2=new Course(2,"c#","engin","xx",0.0);
       Course cours3=new Course(3,"python","engin","xx",0.0);
       Course[] courses= {course1,course2,cours3};
       for (Course item : courses) {
		 System.out.println(item.name+"\t"+item.educatorName);
	}
       Category category1=new Category(1,"programlama");
       Category category2=new Category(2,"programlama");
       Category category3=new Category(3,"programlama");
       Category[] categorys= {category1,category2,category3};
       for (Category item : categorys) {
		System.out.println(item.name);
	}
       Educator educator1=new Educator(1, "engin","xxx","xxx");
       Educator educator2=new Educator(1, "engin","xxx","xxx");
       Educator educator3=new Educator(1, "engin","xxx","xxx");
       Educator[] educators= {educator1,educator2,educator3};
       for (Educator educator : educators) {
		System.out.println(educator.name+"\t"+educator.detail);
	}
       CurrentUser currentUser1=new CurrentUser(1,"berkan","ss","ss","ss","ss");
       CurrentUser currentUser2=new CurrentUser(1,"ss","ss","ss","ss","ss");
       CurrentUser currentUser3=new CurrentUser(1,"ss","ss","ss","ss","ss");
       CurrentUser[] currentUsers= {currentUser1,currentUser2,currentUser3};
       for (CurrentUser currentUser : currentUsers) {
		  System.out.println(currentUser.name+"\t"+currentUser.email);
	}
       CourseManager courseManager=new CourseManager();
       courseManager.addToCourseCurrent(course1, currentUser1);
       courseManager.addToCourseEducator(course1, educator1);
       
 	}

}
