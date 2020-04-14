package ticketing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.Calendar;

public class GeneralReservation extends JFrame{
   JTextArea ta;
   JLabel l_name = new JLabel("이름");
   JLabel l_tel = new JLabel("전화번호");
   JLabel l_info = new JLabel("예매정보창");
   
   
   JTextField  tf_name = new JTextField(10);
   JTextField tf_tel = new JTextField(10);
   JButton b_reservation, b_seat;
   GeneralReservation()
   {
      ta = new JTextArea(50,30);
      b_reservation = new JButton("예매");
      b_seat = new JButton("좌석 선택");
   }
   void display()
   {
      setLayout(new BorderLayout());
      //( 이름, 전화번호, 예매 )왼쪽 패널
      JPanel pl = new JPanel(new GridLayout(3,1));
      JPanel pname = new JPanel(new FlowLayout());
      pname.setBackground(Color.white);
      //이름칸
      pname.add(l_name);
      pname.add(tf_name);
      pl.add(pname);
      //번호칸
      JPanel ptel = new JPanel(new FlowLayout());
      ptel.setBackground(Color.white);
      ptel.add(l_tel);
      ptel.add(tf_tel);
      pl.add(ptel);

      //좌석선택, 예매버튼
      JPanel pbutton = new JPanel(new GridLayout(2,1));
      pbutton.add(b_seat);
      pbutton.add(b_reservation);
      
      pl.add(pbutton);
      
      add(pl, BorderLayout.CENTER);   
      //( 정보창 )오른쪽 패널
      JPanel pinfo = new JPanel(new BorderLayout());
      pinfo.add(l_info, BorderLayout.NORTH);
      pinfo.add(ta, BorderLayout.SOUTH);
      add(pinfo,BorderLayout.EAST);
      
      setLocation(200, 200);
      setSize(700,300);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   

   public static void main(String[] args)  {
      GeneralReservation g = new GeneralReservation();
      g.display();
      

   }

}