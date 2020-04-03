package isac;

import javax.swing.*;
import java.awt.*;
import java.lang.*;
import javax.swing.event.*;



public class Mainisac extends JFrame{

	Itoast t1;
	Icoffeandtea ct1;
	Ijuiceanddrink jd1;
	Builds bu;
	
	Mainisac()
	{
		super("이삭토스트 메뉴판 메뉴를 골라주세용 계산완료됩니다");
		t1 = new Itoast();
		ct1 = new Icoffeandtea();
		jd1 = new Ijuiceanddrink();
		bu = new Builds();
		
		JTabbedPane pane1 = new JTabbedPane();
		
		pane1.add("Toast",t1);
		pane1.add("CoffeeAndTea",ct1);
		pane1.add("JuiceAndDrink",jd1);
		pane1.add("Builds",bu);
		
		
		add(pane1);
		setSize(1400,970);
		setVisible(true);
		setLocation(50, 50);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		Mainisac me = new Mainisac();
		Itoast toast = new Itoast();
		Builds builds = new Builds();

	}

}
		