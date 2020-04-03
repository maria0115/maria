package io.objectstream;

import java.io.Serializable;

//직렬화 : 개체가 스트림을 통과하기 위해서
public class Person implements Serializable{	//스트림을 통과하기위한 인터페이스
	
	private String name;
	private int age;
	private double height;
	private char bloodType;
	Person()
	{}
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
	public char getBlood() {
		return bloodType;
	}
	public void setBlood(char bloodType) {
		this.bloodType = bloodType;
	}
	
	

}
