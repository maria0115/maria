package x_isac;

import javax.swing.*;


import javafx.scene.control.TextArea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toast extends JPanel
{
	JLabel spl, whi,totalmenu;
	JButton baconcheesebagle, baconpotatopizza , pizza, potato;
	JButton add, cancel, total, order;
	JPanel p_add;
	JTextArea ta,ta1;
	
	JPanel p_toast;
	
	//TextArea texta;
	public Toast()
	{
		setlayout();

		eventProc();
	}
	
	void setlayout()
	{
		//추가 캔슬 등등
		p_add = new JPanel(new FlowLayout());
		ta = new JTextArea("선택한 메뉴",5,20);
		totalmenu = new JLabel("total price");
		ta1 = new JTextArea(1,10);
		add = new JButton("add");
		cancel = new JButton("cancel");
		total = new JButton("total");
		order = new JButton("order");
		
		spl = new JLabel("Special Toast");
		spl.setBackground(Color.white);
		whi = new JLabel("White bread");
		whi.setBackground(Color.white);
		//texta = new TextArea("추가된 메뉴판", 10, 20);
		baconcheesebagle = new JButton("3000",new ImageIcon("src/y_isacimage/베이컨치즈베이글.png"));
		baconcheesebagle.setBackground(Color.white);
		baconpotatopizza = new JButton("4000",new ImageIcon("src/y_isacimage/베이컨토마토피자.png"));
		baconpotatopizza.setBackground(Color.white);
		pizza = new JButton("3500",new ImageIcon("src/y_isacimage/피자토스트.png"));
		pizza.setBackground(Color.white);
		potato =new JButton("3300",new ImageIcon("src/y_isacimage/감자토스트.png"));
		potato.setBackground(Color.white);
		setBackground(Color.white);
		
		setLayout(new GridLayout(3,1));
		
		//special
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(spl, BorderLayout.NORTH);
		JPanel panelbutton = new JPanel(new GridLayout(1, 1)); 
		panelbutton.add(baconcheesebagle);		
		panel.add(panelbutton, BorderLayout.CENTER);
	
		//white
		JPanel panel1 = new JPanel(new BorderLayout());
		panel1.add(whi, BorderLayout.NORTH);
		JPanel panelbutton1 = new JPanel(new GridLayout(1, 3)); 
		panelbutton1.add(baconpotatopizza);
		panelbutton1.add(pizza);
		panelbutton1.add(potato);
		panel1.add(panelbutton1, BorderLayout.CENTER);
		
		
		p_add.add(ta);
		p_add.add(totalmenu);
		p_add.add(ta1);
		p_add.add(add);
		p_add.add(cancel);
		p_add.add(total);
		p_add.add(order);
		
		add(p_add,BorderLayout.SOUTH);
		add(panel);
		
		add(panel1);
//		JPanel panelmenu = new JPanel();
//		//panelmenu.add(texta);
//		panelmenu.add(totalmenu);
//		
//		add(panelmenu);
//		-----------------------------------------
//		setLayout(new BorderLayout());
//
//		p_toast = new JPanel(new GridLayout(3,1));
//		p_toast.add(baconcheesebagle);
	}
		public void eventProc()
		{
			Myevent my = new Myevent();
			baconcheesebagle.addActionListener(my);
			baconpotatopizza.addActionListener(my);
			pizza.addActionListener(my);
			potato.addActionListener(my);
//			baconcheesebagle.addActionListener(new ActionListener() {
//				
//				
//				public void actionPerformed(ActionEvent e) {
//					
//					
//				}
//			});
		}
		
		
		class Myevent implements ActionListener 
		{

			String menu="";
			public void actionPerformed(ActionEvent e) {
				
				Object evt  = e.getSource();
				if(evt ==baconcheesebagle) 
				{
					menu = menu+"\n"+"baconcheesebagle "+" : "+baconcheesebagle.getText();
					ta.setText("선택한메뉴 \n"+menu+" : ");
					
					
				}
				else if(evt ==baconpotatopizza) 
				{
					menu = menu+"\n"+"baconpotatopizza "+" : "+baconpotatopizza.getText();
					ta.setText("선택한메뉴 \n"+menu+" : ");
					
					
				}
				else if(evt ==pizza) 
				{
					menu = menu+"\n"+"pizza "+" : "+pizza.getText();
					ta.setText("선택한메뉴 \n"+menu+" : ");
					
					
					
				}
				else if(evt ==potato) 
				{
					menu = menu+"\n"+"potato "+" : "+potato.getText();
					ta.setText("선택한메뉴 \n"+menu+" : ");
					
					
				}
				
				
				if(evt == cancel)
				{
					
				}
				
			}
	
		}
		
		
		
		
		
	}

