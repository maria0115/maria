package e_static_sam;

public class MainTest {

	public static void main(String[] args) {
		//자원낭비중
		ViewA a = new ViewA();	
		a.use();		//화면에 올림
		ViewB b = new ViewB();
		b.use();		//화면에 올림
		ViewC c = new ViewC();
		c.use();

	}

}
