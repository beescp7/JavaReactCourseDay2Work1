
public class CourseManager {
public void addToCourseCurrent(Course course,CurrentUser currentUser) {
	System.out.println(course.name+" isimli kurs"+currentUser.name+"isimli kullan�c� taraf�nsan eklend�");
	
}
public void addToCourseEducator(Course course,Educator educator) {
	System.out.println(course.name+"isimli kurs"+educator.name+"isimi hoca taraf�ndan eklendi");
	
}
}
