package isac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Ijuiceanddrink extends JPanel{

	JLabel special = new JLabel(new ImageIcon("src/y_isacimage1/과일주스.png")); 
	JLabel white = new JLabel(new ImageIcon("src/y_isacimage1/쉐이크.png"));
	JButton bs1, bw1, bw2, bw3;

	JTextArea ta;
	JButton b_add;
	JButton b_cancel;
	JButton b_total;
	JButton b_order;
	JTextField tf;
	JPanel p_east;
	JPanel p_bt;
	
	public Ijuiceanddrink()
	{
		setlayout();
	}
	public void setlayout()
	{

		special.setBackground(Color.white);
		white.setBackground(Color.white);
		bs1 = new JButton(new ImageIcon("src/y_isacimage1/토마토주스.png"));
		bw1 = new JButton(new ImageIcon("src/y_isacimage1/딸기바나나주스.png"));
		bw2 = new JButton(new ImageIcon("src/y_isacimage1/밀크쉨.png"));
		bw3 = new JButton(new ImageIcon("src/y_isacimage1/딸기쉨.png"));
		bs1.setBackground(Color.white);
		bw1.setBackground(Color.white);
		bw2.setBackground(Color.white);
		bw3.setBackground(Color.white);
		ta = new JTextArea("선택한 메뉴", 35,20);
		b_add = new JButton("add");
		b_cancel = new JButton("cancel");
		b_total = new JButton("total");
		b_order = new JButton("order");
		tf = new JTextField("추가된 메뉴");



		setLayout(new BorderLayout());
		JPanel panel = new JPanel(new GridLayout(2,1));	

		JPanel panelspecial = new JPanel(new BorderLayout());	
		panelspecial.setBackground(Color.white);
		JPanel panelwhite = new JPanel(new BorderLayout());
		panelwhite.setBackground(Color.white);
		panelspecial.add(special,BorderLayout.NORTH);
		JPanel panelgrid1 = new JPanel(new GridLayout(1,2));
		panelgrid1.add(bw1);
		panelgrid1.add(bs1);
		panelspecial.add(panelgrid1,BorderLayout.SOUTH);
		panel.add(panelspecial);

		panelwhite.add(white,BorderLayout.NORTH);
		JPanel panelgrid = new JPanel(new GridLayout(1,2));
		
		panelgrid.add(bw2);
		panelgrid.add(bw3);
		panelwhite.add(panelgrid,BorderLayout.SOUTH);
		panel.add(panelwhite);
		add(panel, BorderLayout.CENTER);

		p_east = new JPanel(new BorderLayout());

		p_east.add(ta,BorderLayout.NORTH);

		p_east.add(tf,BorderLayout.CENTER);

		p_bt = new JPanel(new FlowLayout());
		p_bt.add(b_add);
		p_bt.add(b_cancel);
		p_bt.add(b_total);
		p_bt.add(b_order);

		p_east.add(p_bt,BorderLayout.SOUTH);

		add(p_east,BorderLayout.EAST);




	}
}

