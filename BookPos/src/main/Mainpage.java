package main;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import Food.Snack;
import Food.foodTotal;
import jfreechart.ChartB;
import jfreechart.MyFrame;
import main.Vo.menuInfo;
import oracle.net.aso.p;
import posview.Join;

public class Mainpage  extends JFrame {
	
	Book book;
	Snack snack;
	
	public Mainpage(){
		
		//객체생성
		JTabbedPane pane = new JTabbedPane();
		book = new Book(); 
		snack = new Snack();
		
		pane.add("Pos",book);
		pane.add("간식",snack);
		add(pane);
	
		//화면출력
		setLocation(200, 200);
		setSize(1500,700 );
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	} 
	public void MyFrame(){
		// *******************************************************

		ChartB demo = new ChartB(); // DB에서 가져온 값으로 차트
		JFreeChart chart = demo.getChart();
		ChartPanel chartPanel=new ChartPanel(chart); 
		 
        add(chartPanel);
        setSize(800,400); 
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		
		new Mainpage();
	}

}
