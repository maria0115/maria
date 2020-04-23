package posview;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import javafx.scene.layout.Border;
import main.Vo.customerVo;
import main.model.PosModel;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.sql.SQLException;
import java.util.Calendar;

public class Join extends JFrame implements ActionListener{

	//모델단 변수 
	PosModel model;

	JTextField  tf_name = new JTextField(10); 
	JTextField tf_tel = new JTextField(10);
	JTextField tf_customer = new JTextField(10);;
	JButton b_reservation = new JButton("회원가입");

	public Join() 
	{	
		
		
		setLocation(200, 200);
		setSize(300,300);
		setVisible(true);
		Display();		
		eventProc();
		connectDB();
	}
	
	public void connectDB(){

		try {
			model = new PosModel();
		} catch (Exception e) {
			System.out.println("DB연결 실패 :"+e.getMessage());
		}
		
	}

	public void Display()
	{	
		setLayout(new BorderLayout());

		//( 이름, 전화번호, 예매 )왼쪽 패널
		JPanel jpl = new JPanel(new GridLayout(3,1));
		//이름칸
		JPanel jp_name = new JPanel(new FlowLayout());
		jp_name.setBorder(new TitledBorder("이름"));
		jp_name.setBackground(Color.white);
		jp_name.add(tf_name);
		//번호칸
		JPanel jp_tel = new JPanel(new FlowLayout());
		jp_tel.setBorder(new TitledBorder("전화번호"));
		jp_tel.setBackground(Color.white);
		jp_tel.add(tf_tel);
		//버튼칸
		JPanel jp1 = new JPanel(new FlowLayout());
		jp1.setBackground(Color.white);
		jp1.add(b_reservation);
		
		
		jpl.add(jp_name);
		jpl.add(jp_tel);
		jpl.add(jp1);
		
		add(jpl);


	} 

	public void eventProc() {

		b_reservation.addActionListener(this);

	}
	
	public void actionPerformed(ActionEvent e) {
		JButton ev = (JButton)e.getSource();

		customerVo cv = new customerVo();
		if(ev == b_reservation)
		{			
			cv.setName(tf_name.getText());
			cv.setTel(tf_tel.getText());
			int i = insert();
			if(i == 0)
			{
				JOptionPane.showMessageDialog(null, "이미 등록된 회원입니다.");
				
			}
			else if(i==1)
			{
			JOptionPane.showMessageDialog(null, "회원가입 완료");
			
			new Pos(cv); 
			}
			setVisible(false);
		}

	}
	
	public int insert()
	{
		String name = tf_name.getText();
		String tel = tf_tel.getText();
		customerVo vo = new customerVo();
		vo.setName(name);
		vo.setTel(tel);
		int i=0;
		try {
			i = model.insert(vo);
		} catch (SQLException e) {
			System.out.println("회원가입 실패"+e.getMessage());
		}
		
		tf_name.setText("");
		tf_tel.setText("");
		
		return i;
	}
	

}

