package isac;

import javax.swing.*;
import java.awt.*;
import java.lang.*;
import javax.swing.event.*;

import isac.Itoast.Myevent;



public class Mainisac extends JFrame{

   Itoast toast;
   Icoffeandtea ct1;
   //Ijuiceanddrink jd1;
   Builds bu;
   Mainisac me;
   int result, total1,temp;
   String result2;
   //static int result;
   public static void main(String[] args) {
	   
      
      
      new Mainisac();
      //System.out.println(result1);

      //result=result1;
      
   }
   
   public void setResult(int result) {
		bu.setResult(result);
		
	}
   public void setResult2(String result2)
   {
	   bu.setResult2(result2);
   }
   Mainisac()
   {
	  
      super("이삭토스트 메뉴판 메뉴를 골라주세용 계산완료됩니다");
      //int result1;
      
      toast = new Itoast(this);
     
      //ct1 = new Icoffeandtea(this);
      //jd1 = new Ijuiceanddrink();
      bu = new Builds(this);
      
      JTabbedPane pane1 = new JTabbedPane();
      
      pane1.add("Toast",toast);
      pane1.add("CoffeeAndTea",ct1);
      //pane1.add("JuiceAndDrink",jd1);
      pane1.add("Builds",bu);
      
      
      add(pane1);
      setSize(1400,970);
      setVisible(true);
      setLocation(50, 50);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
   }
   
  

   

}
      