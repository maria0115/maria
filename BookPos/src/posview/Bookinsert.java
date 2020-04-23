package posview;

import java.awt.BorderLayout;
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

import main.Vo.BookInfo;
import main.model.PosModel;

public class Bookinsert extends JFrame {
	 
	JButton jbin = new JButton("입고");
	
	JTextField tfTitle = new JTextField(10); //책제목
	JTextField tfGenre = new JTextField(10); //책장르
	JTextField tfWriter = new JTextField(10); //작가
	JTextField tfPrice = new JTextField(10); //책 가격
	JTextField tfCnt = new JTextField(10); //책 재고
	
	//모델단 변수 
	PosModel model;
	
	public Bookinsert() {
		
		setLayout();
		connectDB();
		eventProc();
		
	}
	

	public void connectDB(){	// DB연결
		try {
			model = new PosModel();
		} catch (Exception e) {
			System.out.println("DB 연결실패"+e.getMessage());
		}
	}
	
	public void setLayout() { //화면설정
		
		setLayout(new BorderLayout());
		//입고를 위한 입력창
		JPanel jp = new JPanel(new GridLayout(6,1));
		jp.setBorder(new TitledBorder("새책 입고"));
		jp.add(new JLabel("책제목"));
		jp.add(tfTitle);
		jp.add(new JLabel("장르"));
		jp.add(tfGenre);
		jp.add(new JLabel("작가"));
		jp.add(tfWriter);
		jp.add(new JLabel("가격"));
		jp.add(tfPrice);
		jp.add(new JLabel("수량"));
		jp.add(tfCnt);
		jp.add(jbin);
		
		add(jp);
		
		setLocation(200, 200);
		setSize(700,700 );
		setVisible(true);
		
	}
	
	
	public void eventProc() {
		
		//입고버튼이 눌렸을때
		jbin.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				JButton evt = (JButton)e.getSource();
				insert();
				
			}
		});
		
		
	} 

	
	//새책 입고
	public void insert() {
		
		//각각의 tf에서 값 가져오기 
		String title = tfTitle.getText();
		String genre = tfGenre.getText();
		String writer = tfWriter.getText();
		int price = Integer.parseInt(tfPrice.getText());
		int cnt = Integer.parseInt(tfCnt.getText());
		
		BookInfo vo = new BookInfo();
		//가져온 값 vo 저장
		vo.setTitle(title);
		vo.setGenre(genre);
		vo.setWriter(writer);
		vo.setPrice(price);
		vo.setCnt(cnt);
		
		try {
			//저장된 값 vo로 보내주고 결과값 int로 받아서 
			int result = model.bookInsert(vo);
			//입고결과 받기 
			if (result == -1){
				JOptionPane.showConfirmDialog(null, "입고실패");
			}else if(result == -2) {
				JOptionPane.showConfirmDialog(null, "책관리번호입력실패");
			}
			
		} catch (Exception e) {
			System.out.println("입고실패:"+e.getMessage());
		}
		
		JOptionPane.showConfirmDialog(null,"입고완료", "Message", JOptionPane.ERROR_MESSAGE);
		//입고완료후 tf 초기화 
		tfTitle.setText(null);
		tfGenre.setText(null);
		tfWriter.setText(null);
		tfPrice.setText(null);
		tfCnt.setText(null);
		
	}
	
	


	
	
	

}
