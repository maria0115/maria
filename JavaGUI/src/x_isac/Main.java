package x_isac;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

//import sun.security.mscapi.KeyStore.MY;

import java.lang.*;

public class Main extends JFrame{

	Toast t;
	CoffeeAndTea ct;
	JuiceAndDrink jd;
	
	Main()
	{
		super("이삭토스트 메뉴판 메뉴를 골라주세용 계산완료됩니다");
		t = new Toast();
		ct = new CoffeeAndTea();
		jd = new JuiceAndDrink();
		
		JTabbedPane pane = new JTabbedPane();
		
		pane.add("Toast",t);
		pane.add("CoffeeAndTea",ct);
		pane.add("JuiceAndDrink",jd);
		
		
		add(pane);
		setSize(1200,800);
		setVisible(true);
		setLocation(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		Main me = new Main();
		Toast toast = new Toast();
		
		
		

	}

}
