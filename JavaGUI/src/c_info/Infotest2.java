package c_info;
import javax.swing.*;
import javafx.scene.layout.Border;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.Calendar;


public class Infotest2 extends JFrame{
	
	//1. 멤버변수 선언
	JTextArea ta;
	JTextField  tfname, tfid, tftel, tfsex, tfage, tfhome;
	JButton bAdd,bshow, bsearch, bdelete, bexit, bcancle;
	
	Infotest2()
	{	
		//2. 객체생성
		ta = new JTextArea();
		tfname = new JTextField(10);
		tfid = new JTextField(10);
		tftel = new JTextField(10);
		tfsex = new JTextField(10);
		tfage = new JTextField(10);
		tfhome = new JTextField(10);
		bAdd = new JButton("지민이 추가",new ImageIcon("src/c_info/imgs/10.jpg"));
		bcancle = new JButton("지민이 취소",new ImageIcon("src/c_info/imgs/5.jpg"));
		bdelete = new JButton("지민이 삭제",new ImageIcon("src/c_info/imgs/6.jpg"));
		bexit = new JButton("지민이 나가기",new ImageIcon("src/c_info/imgs/7.jpg"));
		bsearch = new JButton("지민이 검색",new ImageIcon("src/c_info/imgs/8.jpg"));
		bshow = new JButton("지민이 보기",new ImageIcon("src/c_info/imgs/9.jpg"));
	}
	
	void display()
	{
		//3.화면 구성및 출력
		
		setLayout(new BorderLayout());
		
		JPanel p = new JPanel(new GridLayout(6,2));

		p.add(new JLabel("나이",new ImageIcon("src/c_info/imgs/10.jpg"),JLabel.CENTER));	
		p.add(tfage);
		p.add(new JLabel("집",new ImageIcon("src/c_info/imgs/9.jpg"),JLabel.CENTER));		
		p.add(tfhome);
		p.add(new JLabel("아이디",new ImageIcon("src/c_info/imgs/8.jpg"),JLabel.CENTER));		
		p.add(tfid);
		p.add(new JLabel("이름",new ImageIcon("src/c_info/imgs/7.jpg"),JLabel.CENTER));		
		p.add(tfname);
		p.add(new JLabel("성별",new ImageIcon("src/c_info/imgs/6.jpg"),JLabel.CENTER));		
		p.add(tfsex);
		p.add(new JLabel("전번",new ImageIcon("src/c_info/imgs/5.jpg"),JLabel.CENTER));
		p.add(tftel);
		add(p, BorderLayout.WEST);
		JPanel p1 = new JPanel(new GridLayout(1,6));
		p1.add(bAdd);
		p1.add(bcancle);
		p1.add(bdelete);
		p1.add(bexit);
		p1.add(bsearch);
		p1.add(bshow);
		add(p1, BorderLayout.SOUTH);
		add(ta, BorderLayout.CENTER);
		
		setLocation(200, 200);
		setSize(1500,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	//이벤트 핸들러
	class Myevent implements ActionListener 
	{
	
		public void actionPerformed(ActionEvent e) {
			Object evt  = e.getSource();
			//JButton evt = (JButton)e.getSource();
			//여섯개 모두 같은 형일때 이렇게 형변환해서 쓸 수 있다
			if(evt == bAdd)
			{
				String msg = bAdd.getText();
				JOptionPane.showMessageDialog(null,msg + "합니다");
			}else if(evt == bcancle)
			{
				String msg = bcancle.getText();
				JOptionPane.showMessageDialog(null, msg+"합니다");
			}
			else if(evt == bdelete)
			{
				String msg = bdelete.getText();
				JOptionPane.showMessageDialog(null, msg+"합니다");
			}
			else if(evt == bexit)
			{
				String msg = bexit.getText();
				JOptionPane.showMessageDialog(null, msg+"합니다");
				System.exit(0);
				//의미없는 0
			}
			else if(evt == bsearch)
			{
				String msg = bsearch.getText();
				JOptionPane.showMessageDialog(null, msg+"합니다");
			}
			else if(evt == bshow)
			{
				String msg = bshow.getText();
				JOptionPane.showMessageDialog(null, msg+"합니다");
			}
			
			
		}}
	
	
	void eventProc()
	{
		//객체 생성
		Myevent my = new Myevent();
		
		//객체연결
		bAdd.addActionListener(my);
		bcancle.addActionListener(my);
		bdelete.addActionListener(my);
		bexit.addActionListener(my);
		bsearch.addActionListener(my);
		bshow.addActionListener(my);
		
		// 아이디 텍스트 필드에서 엔터를 쳤을 때 이벤트 처리
		
		
			//(1)이벤트 핸들러
			//(2)이벤트 핸들러 객체 생성
			//(3)이벤트 연결
			tfid.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {	//jvm이 사용자가 입력할때 불러오는 함수			
//						String msg = tfid.getText();
//						JOptionPane.showMessageDialog(null,msg);
					// 주민번호에서 성별을 구하는 코딩
					
					String id = tfid.getText();
						
						
						char sex1 = id.charAt(7);
						if(sex1=='1' | sex1=='3'| sex1=='9')	//까먹지 말고 문자''
						{
							tfsex.setText("남자");
						}else if(sex1 == '2' | sex1=='4'| sex1=='0')
						{
							tfsex.setText("여자");
						}
					// 주민번호에서 출신지를 구해서 출신지 텍스트 필드에 출력
						String age = id.substring(0,2);
						int age2=Integer.parseInt(age);
						Calendar c = Calendar.getInstance();
						int year = c.get(Calendar.YEAR);
						int nai=0;
						
						
						if(sex1=='1'| sex1=='2')
						{
						nai=year-(1900+age2)+1;		//2020을 
						String nai2 = Integer.toString(nai);
						tfage.setText(nai2);
						}
						
						else if(sex1=='3'| sex1=='4')
						{
							nai=year-(2000+age2)+1;
							String nai2 = Integer.toString(nai);
							tfage.setText(nai2);
						}
						else if(sex1=='0'| sex1=='9')
						{
							nai=year-(1800+age2)+1;
							String nai2 = Integer.toString(nai);
							tfage.setText(nai2);}
						
						//주민번호에서 출신지를 구해서 출신지 텍스트 필드에 출력
						char city = id.charAt(8); //'1
						String home="";
						
						switch(city)	//switch 문은 반드시 break;써주기
						{
						default : home="한국인"; break;
						case '0':home = "서울"; break;
						case '1':home="인천";break;
						case '2':home="경기";break;
						case '9':home="제주";break;
						
						}
						
						tfhome.setText(home);
						
						
						
				}				
			});
			
		// 윈도우에 x버튼 눌렸을 때의 이벤트 처리
			addWindowListener(new WindowAdapter() {	//Listener먼저해보기 실수 못잡아줌
//
//				public void windowActivated(WindowEvent e) {
//				}
//
//				public void windowClosed(WindowEvent e) {
//				}

				public void windowClosing(WindowEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "진짜로 나가시겠습니까");
					if(result ==  JOptionPane.OK_OPTION)
					{
					System.exit(0);
					}
				}
//
//				public void windowDeactivated(WindowEvent e) {
//				}
//			
//				public void windowDeiconified(WindowEvent e) {
//				}
//				
//				public void windowIconified(WindowEvent e) {
//				}
//				
//				public void windowOpened(WindowEvent e) {
//				}					
				});
	
	}
	

	public static void main(String[] args) {
		Infotest2 t = new Infotest2();
		t.display();
		t.eventProc();

	}

}
