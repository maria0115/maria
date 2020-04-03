package isac;
import javax.swing.*;
import java.awt.*;
public class JuiceAndDrink extends JPanel{
   
   JLabel fruitl, shal;
   JButton tomato, strawberryandbanana, milk, strawberry;
   JButton add, cancel, total, order;
   JPanel p_add;
   JTextArea ta;
   
   public JuiceAndDrink() {
      
      p_add = new JPanel(new FlowLayout());
      ta = new JTextArea(5,20);
      add = new JButton("add");
      cancel = new JButton("cancel");
      total = new JButton("total");
      order = new JButton("order");
      
      
      fruitl = new JLabel("fruit juice");
      shal = new JLabel("shake");
      tomato = new JButton(new ImageIcon("src/y_isacimage/토마토주스.png"));
      tomato.setBackground(Color.white);
      strawberryandbanana = new JButton(new ImageIcon("src/y_isacimage/딸기바나나주스.png"));
      strawberryandbanana.setBackground(Color.white);
      milk = new JButton(new ImageIcon("src/y_isacimage/밀크쉐이크.png"));
      milk.setBackground(Color.white);
      strawberry = new JButton(new ImageIcon("src/y_isacimage/딸기주스.png"));
      strawberry.setBackground(Color.white);
      setBackground(Color.white);
      setLayout(new GridLayout(3,1));
      //special
      JPanel panel = new JPanel(new BorderLayout());
      panel.add(fruitl, BorderLayout.NORTH);
      JPanel panelbutton = new JPanel(new GridLayout(1, 2)); 
      panelbutton.add(tomato);
      panelbutton.add(strawberryandbanana);
      panel.add(panelbutton, BorderLayout.CENTER);
   
      //white
      JPanel panel1 = new JPanel(new BorderLayout());
      panel1.add(shal, BorderLayout.NORTH);
      JPanel panelbutton1 = new JPanel(new GridLayout(1, 2)); 
      panelbutton1.add(milk);
      panelbutton1.add(strawberry);
      
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