package isac;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
import javax.swing.*;
import java.lang.*;

public class Itoast extends JPanel{

	JLabel special = new JLabel(new ImageIcon("src/y_isacimage1/special toast.png")); 

	JLabel white = new JLabel(new ImageIcon("src/y_isacimage1/white bread.png"));
	JLabel select= new JLabel("선택메뉴"); 
	JLabel add= new JLabel("추가메뉴");
	JButton bs1, bw1, bw2, bw3;

	JTextArea ta,tf;
	//String result2;
	JButton b_add,b_cancel,b_total,b_order,b_plus,b_minus;
	JPanel p_east,p_bt,p_east2,p_bt2;
	JTextField tf2;
	Mainisac isa;
//	int result;
//	int temp;
//	int total1;
	//JScrollPane scrollPane;      //스크롤
	public Itoast(Mainisac isa)
	{
		this.isa = isa;
		setlayout();
		eventProc();
		//resultbill();
	}
//	public int resultbill()
//	{
//		return isa.result;
//	}
	public void setlayout()
	{

		special.setBackground(Color.white);
		white.setBackground(Color.white);
		bs1 = new JButton("3300", new ImageIcon("src/y_isacimage1/베이컨치즈베이글.png"));   
		bs1.setRolloverIcon(new ImageIcon("src/y_isacimage1/치즈.png"));
		bw1 = new JButton("3500", new ImageIcon("src/y_isacimage1/베이컨포테이토피자.png"));
		bw1.setRolloverIcon(new ImageIcon("src/y_isacimage1/감자.jpeg"));
		bw2 = new JButton("4200",new ImageIcon("src/y_isacimage1/피자토스트.png"));
		bw2.setRolloverIcon(new ImageIcon("src/y_isacimage1/피자3.png"));
		bw3 = new JButton("4500",new ImageIcon("src/y_isacimage1/감자토스트.png"));
		bw3.setRolloverIcon(new ImageIcon("src/y_isacimage1/감자.jpeg"));
		bs1.setBackground(Color.white);
		bw1.setBackground(Color.white);
		bw2.setBackground(Color.white);
		bw3.setBackground(Color.white);
		
		ta = new JTextArea(35,20);

		b_add = new JButton("add");
		b_cancel = new JButton("cancel");
		b_total = new JButton("total");
		b_order = new JButton("order");
		tf = new JTextArea(16,8);
		b_plus = new JButton("+");
		b_minus = new JButton("-");
		tf2 = new JTextField("수량");
		//result2= new JTextArea(16,8);
		//scrollPane = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		setLayout(new BorderLayout());
		JPanel panel = new JPanel(new GridLayout(2,1));   

		JPanel panelspecial = new JPanel(new BorderLayout());   
		panelspecial.setBackground(Color.white);
		JPanel panelwhite = new JPanel(new BorderLayout());
		panelwhite.setBackground(Color.white);
		panelspecial.add(special,BorderLayout.NORTH);
		panelspecial.add(bs1,BorderLayout.SOUTH);
		panel.add(panelspecial);

		panelwhite.add(white,BorderLayout.NORTH);
		JPanel panelgrid = new JPanel(new GridLayout(1,3));
		panelgrid.add(bw1);
		panelgrid.add(bw2);
		panelgrid.add(bw3);
		panelwhite.add(panelgrid,BorderLayout.SOUTH);
		panel.add(panelwhite);
		add(panel, BorderLayout.CENTER);

		p_east = new JPanel(new BorderLayout());

		p_east2 = new JPanel(new BorderLayout());
		p_east2.add(select, BorderLayout.NORTH);
		p_east2.add(ta, BorderLayout.SOUTH);
		
		p_east.add(p_east2,BorderLayout.NORTH);
		//스크롤 해야함

		p_bt2= new JPanel(new BorderLayout());
		p_bt2.add(add, BorderLayout.NORTH);
		p_bt2.add(tf, BorderLayout.SOUTH);
		p_east.add(p_bt2,BorderLayout.CENTER);

		p_bt = new JPanel(new GridLayout(2,4));
		p_bt.add(b_add);
		p_bt.add(b_plus);
		p_bt.add(tf2);
		p_bt.add(b_minus);
		p_bt.add(b_cancel);
		p_bt.add(b_total);
		p_bt.add(b_order);

		p_east.add(p_bt,BorderLayout.SOUTH);

		add(p_east,BorderLayout.EAST);


	}

	String []total = new String[50];
	
	
	public void eventProc()
	{
		Myevent my = new Myevent();
		b_add.addActionListener(my);
		b_cancel.addActionListener(my);
		b_total.addActionListener(my);
		b_order.addActionListener(my);
		b_plus.addActionListener(my);
		b_minus.addActionListener(my);
		bs1.addActionListener(my);
		bw1.addActionListener(my);
		bw2.addActionListener(my);
		bw3.addActionListener(my);
		int j;
		
	}
	public class Myevent implements ActionListener 
	{
		
		String menu="";
		String prev="";
		String []pre = new String[50];
		
		JButton prev1;
		int su;
		int i=0;
		
		public void actionPerformed(ActionEvent e) {
			Object evt  = e.getSource();
			
			if(evt == bs1)
			{
				if(prev1 == b_cancel)
				{
					i++;
				}
				int returnValue = JOptionPane.showConfirmDialog(null,"베이컨치즈베이글 선택하시겠습니까","",JOptionPane.YES_NO_OPTION);

				if(returnValue==0)
				{
					
					tf.setText("");
					pre[i] = "베이컨치즈베이글";
					total[i]=bs1.getText();
					for(int h=0; h<i+1;h++)
					{
						menu+=pre[h]+" "+total[h]+"\n";
						isa.temp = Integer.parseInt(total[i]);
						
					}
					isa.total1 += isa.temp;
					tf.setText(menu);
					
					
					i++;
					prev1 = (JButton)evt;
					menu = "";
				}

			}
			else if(evt == bw1)
			{
				int returnValue = JOptionPane.showConfirmDialog(null,"베이컨포테이토피자 선택하시겠습니까","",JOptionPane.YES_NO_OPTION);
				if(returnValue==0)
				{
					if(prev1 == b_cancel)
					{
						i++;
					}
					tf.setText("");
					pre[i] = "베이컨포테이토피자";
					total[i]=bw1.getText();
					for(int h=0; h<i+1;h++)
					{
						menu+=pre[h]+" "+total[h]+"\n";
						isa.temp = Integer.parseInt(total[i]);
						
					}
					isa.total1 += isa.temp;
					tf.setText(menu);
					
					++i;
					prev1 = (JButton)evt;
					menu = "";
				}
			}
			else if(evt == bw2)
			{
				int returnValue = JOptionPane.showConfirmDialog(null,"피자토스트 선택하시겠습니까","",JOptionPane.YES_NO_OPTION);
				if(returnValue==0)
				{
					if(prev1 == b_cancel)
					{
						i++;
					}
					tf.setText("");
					pre[i] = "피자토스트";
					total[i]=bw2.getText();
					for(int h=0; h<i+1;h++)
					{
						menu+=pre[h]+" "+total[h]+"\n";
						isa.temp = Integer.parseInt(total[i]);
						
					}
					isa.total1 += isa.temp;
					tf.setText(menu);
					
					++i;
					prev1 = (JButton)evt;
					menu = "";
				}
			}         
			else if(evt == bw3)
			{
				int returnValue = JOptionPane.showConfirmDialog(null,"감자토스트 선택하시겠습니까","",JOptionPane.YES_NO_OPTION);
				if(returnValue==0)
				{
					if(prev1 == b_cancel)
					{
						i++;
					}
					
					tf.setText("");
					pre[i] = "감자토스트";
					total[i]=bw3.getText();
					for(int h=0; h<i+1;h++)
					{
						menu+=pre[h]+"  "+total[h]+"\n";
						isa.temp = Integer.parseInt(total[i]);
						
					}   
					
					isa.total1 += isa.temp;
					tf.setText(menu);
					menu = "";
					++i;
					prev1 = (JButton)evt;
				}
			}         
			else if(evt == b_add) {

				int return1 = JOptionPane.showConfirmDialog(null, "추가하시겠습니까?","알림", JOptionPane.YES_NO_CANCEL_OPTION);
				if(return1 == 0) {
					
					String textf = tf2.getText();	//수량
					//int textf1 = Integer.parseInt(textf);
					
					ta.append(tf.getText()+" * "+tf2.getText()+"\n");
					isa.result2= ta.getText();
					tf.setText("");
					for(int i=0; i<pre.length;i++)
					{
						pre[i]="";
						//isa.total1 += Integer.parseInt(total[i]);
						total[i]="";
						
					}
					
				}
			}

			else if(evt == b_cancel) {     
				if(i>=0)
				{
					if(prev1 == bw2|prev1 == bw1|prev1 == bw3|prev1 == bs1)
					{
						i--;
						pre[i]="";
					}
					for(int h=0; h<i;h++)
					{						
						menu+=pre[h]+" "+total[h]+" \n";					
						isa.temp = Integer.parseInt(total[i]);
						
					}   
					
					isa.total1 -= isa.temp;
					tf.setText(menu);
					menu = "";
					--i;
					prev1 = (JButton)evt;

				}
				else
				{
					tf.setText("메뉴를 추가하세요");
				}

			}
			else if(evt == b_plus) {
				++su;
				tf2.setText(Integer.toString(su)+"\n");

			}
			else if(evt == b_minus) {
				--su;
				tf2.setText(Integer.toString(su)+"\n");
			}
			else if(evt == b_total)
			{
				isa.setResult(isa.total1);
			}
			else if(evt == b_order)
			{
				isa.setResult2(isa.result2);
			}

			
			isa.result = isa.total1;
			


		}
		

	}
}