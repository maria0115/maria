package a_sample;
import java.awt.*;	//소속까지 명시적으로 해주기
//-----------has - a방식
public class Test {
	
	//멤버변수 선언
	Frame f;
	Button b;
	Label l;
	TextField tf;
	TextArea ta;
	Checkbox w,m;
	List food;
	
	public Test() //생성자함수
	{
		//객체 생성
		f = new Frame("나의 창");
		b = new Button("okay");
		l = new Label("name");
		tf = new TextField("이름은 5자미만입니다.",40);
		ta = new TextArea();
		w = new Checkbox("woman",true);	//처음 check가 되어있는지
		m = new Checkbox("man");
		//food = new List(3);
		
		//붙이기
		// Layout : 붙이는 방식
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout(4,2));
		f.setLayout(new BorderLayout());
		f.add(b, BorderLayout.WEST);
		f.add(l, BorderLayout.EAST);
		f.add(tf, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		Panel p = new Panel();
		p.setLayout( new GridLayout(2,1));
		p.add(w);
		p.add(m);	//한 영역에 하나만 붙일 수 있음
		f.add(p,BorderLayout.SOUTH);
//		food.add("bob");
//		food.add("guksu");
//		food.add("meal");
//		food.add("bob");
//		food.add("guksu");
//		food.add("meal");
//		f.add(food);
		//화면 출력
		f.setSize(500,400);
		f.setVisible(true);
	}	

	public static void main(String[] args) {
		Test t = new Test();

	}

}
