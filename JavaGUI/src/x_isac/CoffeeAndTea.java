package x_isac;
import javax.swing.*;
import java.awt.*;

public class CoffeeAndTea extends JPanel{
	JLabel cofl, tealattel;
	JButton espresso, americano,hotmilkteaandicedmilktea,icedtea;
	JButton add, cancel, total, order;
	JPanel p_add;
	JTextArea ta;
	public CoffeeAndTea() {
		
		p_add = new JPanel(new FlowLayout());
		ta = new JTextArea(5,20);
		add = new JButton("add");
		cancel = new JButton("cancel");
		total = new JButton("total");
		order = new JButton("order");
		
		
		cofl = new JLabel("Coffee");
		
		tealattel = new JLabel("Tea and latte");
		espresso = new JButton(new ImageIcon("src/y_isacimage/에스프레소.png"));
		espresso.setBackground(Color.white);
		americano = new JButton(new ImageIcon("src/y_isacimage/아메리카노.png"));
		americano.setBackground(Color.white);
		hotmilkteaandicedmilktea = new JButton(new ImageIcon("src/y_isacimage/밀크티.png"));
		hotmilkteaandicedmilktea.setBackground(Color.white);
		icedtea = new JButton(new ImageIcon("src/y_isacimage/아이스티.png"));
		icedtea.setBackground(Color.white);
		setBackground(Color.white);
		setLayout(new GridLayout(3,1));
		//special
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(cofl, BorderLayout.NORTH);
		JPanel panelbutton = new JPanel(new GridLayout(1, 2)); 
		panelbutton.add(espresso);
		panelbutton.add(americano);
		panel.add(panelbutton, BorderLayout.CENTER);
	
		//white
		JPanel panel1 = new JPanel(new BorderLayout());
		panel1.add(tealattel, BorderLayout.NORTH);
		JPanel panelbutton1 = new JPanel(new GridLayout(1, 2)); 
		panelbutton1.add(hotmilkteaandicedmilktea);
		panelbutton1.add(icedtea);
		
		panel1.add(panelbutton1, BorderLayout.CENTER);
		
		p_add.add(ta);
		p_add.add(add);
		p_add.add(cancel);
		p_add.add(total);
		p_add.add(order);
		add(p_add);
		
		add(panel);
		
		add(panel1);
		
	}

}
