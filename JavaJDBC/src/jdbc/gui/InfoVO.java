package jdbc.gui;

public class InfoVO {

	String name;
	int age;
	String gender;
	String home;
	String id;
	String tel;
	
	InfoVO(){}
	
	InfoVO(String name, String jumin, String tel, String gender, String home, int age)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.id = jumin;
		this.home = home;
		this.tel=tel;
	}
	
	public String toString()
	{
		return name+"\t"+id+"\t"+tel+"\t"+gender+"\t"+age+"\t"+home+"\n";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}
