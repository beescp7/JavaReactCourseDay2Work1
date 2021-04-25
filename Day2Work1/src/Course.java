
public class Course {
int id;
String name;
String educatorName;
String educatorImgUrl;
double comlated;
public Course(int id, String name, String educatorName, String educatorImgUrl, double comlated) {
	super();
	this.id = id;
	this.name = name;
	this.educatorName = educatorName;
	this.educatorImgUrl = educatorImgUrl;
	this.comlated = comlated;
}
public Course()
{
	System.out.println("parametresýz kurucu Cource");
}
}
