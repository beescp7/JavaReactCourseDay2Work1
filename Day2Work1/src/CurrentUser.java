
public class CurrentUser {
int id;
String name;
String email;
String adres;
String kartBilgileri;
String sifre;
public CurrentUser(int id, String name, String email, String adres, String kartBilgileri, String sifre) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.adres = adres;
	this.kartBilgileri = kartBilgileri;
	this.sifre = sifre;
}
public CurrentUser()
{
	System.out.println("parametresiz kurucu CurrentUser");
}
}
