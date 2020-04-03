package isac;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
import javax.swing.*;

import com.sun.webkit.ContextMenu.ShowContext;



public class Itoast extends JPanel{

	JLabel special = new JLabel(new ImageIcon("src/y_isacimage1/special toast.png")); 

	JLabel white = new JLabel(new ImageIcon("src/y_isacimage1/white bread.png"));

	JButton bs1, bw1, bw2, bw3;

	JTextArea ta;
	JButton b_add;
	JButton b_cancel;
	JButton b_total;
	JButton b_order;
	JTextArea tf;
	JPanel p_east;
	JPanel p_bt;
	JButton b_plus;
	JButton b_minus;
	JTextField tf2;
	//JScrollPane scrollPane;		//스크롤
	public Itoast()
	{
		setlayout();
		eventProc();
	}

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
		ta = new JTextArea("선택한 메뉴", 35,20);

		b_add = new JButton("add");
		b_cancel = new JButton("cancel");
		b_total = new JButton("total");
		b_order = new JButton("order");
		tf = new JTextArea("추가된 메뉴");
		b_plus = new JButton("+");
		b_minus = new JButton("-");
		tf2 = new JTextField("수량");
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

		p_east.add(ta,BorderLayout.NORTH);
		//스크롤 해야함


		p_east.add(tf,BorderLayout.CENTER);

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
	private Component scrollPane(JTextArea ta2) {
		// TODO Auto-generated method stub
		return null;
	}

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
	}
	class Myevent implements ActionListener 
	{
		String menu="";
		String prev="";
		String []pre = new String[50];
		int su;
		int i=0;
		public void actionPerformed(ActionEvent e) {
			Object evt  = e.getSource();

			if(evt == bs1)
			{
				int returnValue = JOptionPane.showConfirmDialog(null,"베이컨치즈베이글 선택하시겠습니까","",JOptionPane.YES_NO_OPTION);

				if(returnValue==0)
				{
					pre[i] = "베이컨치즈베이글"+" : "+bs1.getText()+"\n";

					menu+=pre[i];


					tf.setText(menu);

					i++;

				}

			}
			else if(evt == bw1)
			{
				int returnValue = JOptionPane.showConfirmDialog(null,"베이컨포테이토피자 선택하시겠습니까","",JOptionPane.YES_NO_OPTION);
				if(returnValue==0)
				{
					pre[i] = "베이컨포테이토피자"+" : "+bw1.getText()+"\n";

					menu+=pre[i];

					tf.setText(menu);

					i++;

				}
			}
			else if(evt == bw2)
			{
				int returnValue = JOptionPane.showConfirmDialog(null,"피자토스트 선택하시겠습니까","",JOptionPane.YES_NO_OPTION);
				if(returnValue==0)
				{
					pre[i] = "피자토스트"+" : "+bw2.getText()+"\n";

					menu+=pre[i];

					tf.setText(menu);

					i++;

				}
			}			
			else if(evt == bw3)
			{
				int returnValue = JOptionPane.showConfirmDialog(null,"감자토스트 선택하시겠습니까","",JOptionPane.YES_NO_OPTION);
				if(returnValue==0)
				{
					pre[i] = "감자토스트"+" : "+bw3.getText()+"\n";

					menu+=pre[i];

					tf.setText(menu);
					i++;					
				}
			}			
			else if(evt == b_add) {
				int return1 = JOptionPane.showConfirmDialog(null, "추가하시겠습니까?","알림", JOptionPane.YES_NO_CANCEL_OPTION);
				if(return1 == 0) {

					String textf = tf2.getText();
					int textf1 = Integer.parseInt(textf);
					ta.append(tf.getText()+" * "+textf1+"\n");
					tf.setText("");
					menu="";
				}
			}
			else if(evt == b_cancel) {	  
				if(i>=0)
				{
					--i;	            	
					for(int h=0; h<i;h++)
					{
						prev+=pre[h];	            	
					}
					tf.setText(prev); 
					prev="";

				}
			}
			else if(evt == b_plus) {
				++su;
				tf2.setText(Integer.toString(su));

			}
			else if(evt == b_minus) {
				--su;
				tf2.setText(Integer.toString(su));
			}


		}

	}
}
