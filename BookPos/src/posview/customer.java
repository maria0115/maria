package posview;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import jdk.nashorn.internal.scripts.JO;
import main.Vo.customerVo;
import main.model.PosModel;

public class customer extends JFrame implements ActionListener{

	//모델단 변수 
	PosModel model;
	
	customerVo vo = new customerVo();
	
	JTextField tf_tel = new JTextField(10); //전화번호 입력창 
	JButton jb  = new JButton("확인");

	
	public customer() {
		
		
		Display();		
		connectDB();
		eventProc();
	} 
	

	public void connectDB(){

		try {
			model = new PosModel();
		} catch (Exception e) {
			System.out.println("DB연결 실패 :"+e.getMessage());
		}
		
	}
	
	public void Display() {
		
		setLayout(new GridLayout(3, 1));
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.white);
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.setBorder(new TitledBorder("회원 전화번호 확인"));
		jp2.setBackground(Color.white);
		jp2.add(new JLabel("전화번호"));
		jp2.add(tf_tel);
		jp2.add(jb);
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.white);
		
		add(jp1);
		add(jp2);
		add(jp3);
		
		setLocation(200, 200);
		setSize(300,300);
		setVisible(true);
		
	
	}
	
	
	public void eventProc() {
		
		jb.addActionListener(this);
		tf_tel.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object evt = e.getSource();
		
		//확인버튼 눌렀을때
		if(evt == jb) {
			
			int result = selectByTel(); 
			if(result == 0) {
			selectCustomer();
			}else if(result == 1) {
				JOptionPane.showConfirmDialog(null, "존재하지 않는 회원입니다.");
				
			}
			setVisible(false);
		//번호 입력후 엔터눌렀을때
		}else if(evt == tf_tel) {
			
			int result = selectByTel();
			if(result == 0) {
			selectCustomer();
			}else if(result == 1) {
				JOptionPane.showConfirmDialog(null, "존재하지 않는 회원입니다.");
			}
			setVisible(false);
		}
			
		
	}
	
	//회원정보 유무 알아보기
	public int selectByTel() {
		
		//입력받은 전화번호 tel에 저장 
		String tel = tf_tel.getText();
		try {
			//저장한 tel 보내주고 return값 temp에 받아서
			String temp = model.selectByTel(tel);
			
			//받은temp와 입력한 tel이랑 비교해서 회원이면 안내창 띄워주기
			if(temp.equals(tel)) {
				JOptionPane.showConfirmDialog(null, "회원입니다.");
				return 0;
				
			}else {
				
				return 1;
			}
		} catch (Exception e) {
			
		}
		return 1;
		
		
	}
	
	//전화번호로 회원 검색해서 회원이름 , 전화번호가져오기
	public void selectCustomer() {
		
		//입력받은 전화번호 tel에 저장 
		String tel = tf_tel.getText();
		customerVo vo = null;
		
		try {
			//저장된 tel 보내주고 vo에 회원 정보 입력해서 받기 
			vo = model.selectCustomer(tel);
			//받아온 vo Pos클래스로 보내주기
			Pos pos = new Pos(vo);
		
		} catch (Exception e) {
			System.out.println("회원정보 가져오기 실패"+e.getMessage());
		}
		
		tf_tel.setText(null);
	}
	
	
	
	
}
