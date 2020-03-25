
public class Main2 {

	public static void main(String[] args) {
		
		person p = method();
		
		System.out.println("이름: "+p.getName());
		System.out.println("나이: "+p.getAge());
		System.out.println("키: "+p.getHeight());

	}
	
	static person method() {
		
		String name = "홍길자";
		int age = 24;
		double height = 190.99;
		
		person p = new person();
		p.setName(name);
		p.setAge(age);
		p.setHeight(height);
		
		return p;
		
	}

}

class person {
	
	
	private String name;
	private int age ;
	private double height;
	
	
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}