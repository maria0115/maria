package Sittotal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SitA extends JPanel {
	
	JButton [] jbs1 = new JButton[300]; //좌석을 위한 버튼
	JLabel jl1;
	
	public SitA() {
		setLayout(new BorderLayout());
		//A구역 
		JPanel jp1 = new JPanel(new GridLayout(10, 30));
		jl1 = new JLabel("A구역");
		jl1.setFont(jl1.getFont().deriveFont(30.0f));
		int h = 1;
		char j='A'-1;
		for(int i=0; i<jbs1.length ; i++) { //버튼생성			
			if(i%30==0)
			{
				j = (char) (j+1);
				h=1;
			}
			
			jbs1[i] = new JButton(j+String.valueOf(h)); 
			jbs1[i].setBackground(Color.gray);
			h++;
		}
		
		
		
		
		for(int i=0 ; i<jbs1.length ; i++) {
			jp1.add(jbs1[i]);
		}
		
		add(jl1,BorderLayout.NORTH);
		add(jp1,BorderLayout.CENTER);
		
	
		
	}
	



}


