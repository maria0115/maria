package b_sample;

// AWT -> Swing
import java.awt.*;	//소속까지 명시적으로 해주기
import javax.swing.*;
//-----------has - a방식
public class Test {
	
	//멤버변수 선언
	JFrame f;
	JButton b;
	JLabel l;
	JTextField tf;
	JTextArea ta;
	JCheckBox w,m;
	JList food;
	
	public Test() //생성자함수
	{
		//객체 생성
		f = new JFrame("나의 창");
		b = new JButton("okay");
		l = new JLabel("name");
		tf = new JTextField("이름은 5자미만입니다.",40);
		ta = new JTextArea();
		w = new JCheckBox("woman",true);	//처음 check가 되어있는지
		m = new JCheckBox("man");
		String data[]={"bob","guksu","meal","bob","guksu","meal"};
		food = new JList(data);
		//food = new List(3);
		
		//붙이기
		// Layout : 붙이는 방식
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout(4,2));
		f.setLayout(new BorderLayout());
		f.add(b, BorderLayout.WEST);
		f.add(l, BorderLayout.EAST);
		JPanel p1 = new JPanel();
		//p1.setLayout(new FlowLayout());
		p1.add(tf);
		p1.add(food);
		f.add(p1,BorderLayout.NORTH);
		
		f.add(ta, BorderLayout.CENTER);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,1));
		p.add(w);
		p.add(m);	//한 영역에 하나만 붙일 수 있음
		f.add(p,BorderLayout.SOUTH);
		
		
		//food.add();
		
		//f.add(food);
		//화면 출력
		f.setSize(500,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	

	private LayoutManager GridLayout(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		Test t = new Test();

	}

}
