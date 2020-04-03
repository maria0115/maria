package c_collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
	
		ArrayList<Student> data = method();
		//여기서 출력
		
			System.out.println(data);
			for(Student d : data)
			{
				System.out.println(d);
			}
			for(int i=0; i<data.size();i++)
			{
				System.out.println(data.get(i));
			}
			
		
	
	}
	
	static ArrayList<Student> method()
	{// 세명의 학생 정보를 저장 : ArrayList 이용
		Student a = new Student("홍ㄱㄹ동",25);
		Student b = new Student("홍ㄱㄹ자",26);
		Student c = new Student("홍ㄱㄹ숙",27);
		
		ArrayList<Student> data = new ArrayList<Student>();
		data.add(a);
		data.add(b);
		data.add(c);
		//data.add("29");
		return data;
	}

}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
