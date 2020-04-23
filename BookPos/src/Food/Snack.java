package Food;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.*;
import javax.swing.border.TitledBorder;


import main.Vo.orderlistInfo;
import main.model.SnackModel;

public class Snack extends JPanel {

	int count = 1;  

	//JLabel snack_list = new JLabel("간식");
	JButton[] bsnack = new JButton[4]; //간식버튼
	JButton[] bdrink = new JButton[4]; //음료버튼
	JButton b_order = new JButton("주문");
	JButton b_plus = new JButton("+");
	JButton b_minus = new JButton("-");
	JButton b_del = new JButton("주문 취소");
	JButton b_ordertotal = new JButton("매출관리");

	JTextField tf_cnt = new JTextField(Integer.toString(count),4); //주문수량
	JTextField tf_name = new JTextField(5); //메뉴이름
	JTextField tf_price= new JTextField(5); //가격
	JTextField tf_totalnum = new JTextField(5);


	JTextArea ta;	
	String [] snackmenu = {"나쵸","츄러스","컵과일","핫도그"}; //간식메뉴명
	String [] drinkmenu = {"물","이온음료","커피","맥주"};//음료메뉴명
	int [] snackpr = {2000,1500,2000,2500}; //간식가격
	int [] drinkpr = {1000,1500,1500,2000};//음료가격 
	ArrayList<String> menutemp = new ArrayList<String>();
 

	//모델단 변수
	SnackModel model;

	public Snack( ){
		setlayout();
		eventProc();
		connectDB();
	}

	public void connectDB(){	// DB연결
		try {
			model = new SnackModel();
		} catch (Exception e) {
			System.out.println("video 연결실패"+e.getMessage());
		}
	}

	public void setlayout() { //화면설정

		for(int i=0;i<bdrink.length;i++) {
			bdrink[i]  = new JButton( new ImageIcon("src/Food/drinkimg/"+i+".png"));
			bdrink[i].setRolloverIcon(new ImageIcon("src/Food/drinkimg1/"+i+".png"));
			bdrink[i].setBackground(Color.white);
		}
		for(int i=0;i<bsnack.length;i++) {
			bsnack[i]  = new JButton( new ImageIcon("src/Food/foodimg/"+i+".png"));
			bsnack[i].setRolloverIcon(new ImageIcon("src/Food/foodimg1/"+i+".png"));
			bsnack[i].setBackground(Color.white);
		}


		ta = new JTextArea(30,10);

		setLayout(new BorderLayout());
		JPanel panel1 = new JPanel(new GridLayout(1,2));//오른쪽 메뉴선택창
		JPanel panel1_snack = new JPanel(new GridLayout(2,2));//간식버튼넣을곳
		JPanel panel1_drink = new JPanel(new GridLayout(2,2));//음료버튼넣을곳 

		//간식버튼 붙여주기 
		for(int i=0;i<bsnack.length;i++) {
			panel1_snack.add(bsnack[i]);
		}
		
		//음료버튼 붙여주기 
		for(int i=0;i<bdrink.length;i++) {
			panel1_drink.add(bdrink[i]);
		}

		panel1.add(panel1_snack);
		panel1.add(panel1_drink);
		add(panel1,BorderLayout.CENTER);

		//왼쪽 주문창 
		JPanel panel2 = new JPanel(new GridLayout(3,1));
		panel2.setBorder(new TitledBorder("주문창"));
		panel2.add(ta,BorderLayout.CENTER);
		add(panel2,BorderLayout.EAST);

		//주문정보 ft
		JPanel panel2_b_tf = new JPanel(new GridLayout(3,1));
		panel2_b_tf.add(new JLabel("메뉴"));
		panel2_b_tf.add(tf_name);
		panel2_b_tf.add(new JLabel("가격"));
		panel2_b_tf.add(tf_price);
		panel2_b_tf.add(new JLabel("총가격"));
		panel2_b_tf.add(tf_totalnum);

		//수량체크
		JPanel p_count = new JPanel(new GridLayout(1,3));
		p_count.add(b_minus);
		p_count.add(tf_cnt);
		p_count.add(b_plus);

		//각각의 ㅣ버튼
		JPanel panel2_b = new JPanel(new GridLayout(4,1));
		panel2_b.add(p_count);
		panel2_b.add(b_del); 
		panel2_b.add(b_order); 
		panel2_b.add(b_ordertotal);


		panel2.add(panel2_b_tf);
		panel2.add(panel2_b,BorderLayout.SOUTH);

	}
	public void eventProc() {

		Myevent my = new Myevent();

		for(int i=0;i<bdrink.length;i++) {
			bdrink[i].addActionListener(my);
		}
		for(int i=0;i<bsnack.length;i++) {
			bsnack[i].addActionListener(my);
		}

		b_order.addActionListener(my);
		b_plus.addActionListener(my);
		b_minus.addActionListener(my);
		b_del.addActionListener(my);
		b_ordertotal.addActionListener(my);


	}
	public class Myevent implements ActionListener{

		String temp = "";

		public void actionPerformed(ActionEvent e) {
			Object evt = e.getSource();
			//음료버튼 이벤트처리 
			for(int i=0;i<bdrink.length;i++) {
				if(evt == bdrink[i]) {
					tf_name.setText(drinkmenu[i]);
					tf_price.setText(Integer.toString(drinkpr[i]));
					tf_cnt.setText(Integer.toString(count));
					tf_totalnum.setText(Integer.toString(drinkpr[i]));

				}
			}
			//간식버튼 이벤트처리 
			for(int i=0;i<bsnack.length;i++) {
				if(evt == bsnack[i]) {
					tf_name.setText(snackmenu[i]);
					tf_price.setText(Integer.toString(snackpr[i]));
					tf_cnt.setText(Integer.toString(count));
					tf_totalnum.setText(Integer.toString(snackpr[i]));

				}
			}

			if(evt == b_order) { //주문하기 버튼을 눌렀을때

				String name = tf_name.getText();
				String price = tf_price.getText();
				String cnt = tf_cnt.getText();

				temp += name+"   "+price+"원"+"    *"+cnt+"\n";
				ta.setText(temp);

				insert();
				tf_cnt.setText(Integer.toString(count));
			}else if(evt == b_plus) { //+버튼 눌렀을때 
				tf_cnt.setText("");
				count += 1;
				String cnt = String.valueOf(count);
				tf_cnt.setText(cnt);
				plus();
			}else if(evt == b_minus) { //-버튼 눌렀을때
				tf_cnt.setText("");
				count -= 1;
				String cnt = String.valueOf(count);
				tf_cnt.setText(cnt);
				minus();
			}else if(evt == b_del) { //주문취소버튼 눌렀을때
				del();
			}else if(evt == b_ordertotal) { //매출관리버튼 눌렀을때
				new foodTotal();
			}

		}


		public void insert() { //주문하기 버튼 눌렀을때

			String menuname = tf_name.getText();
			int pri = Integer.parseInt(tf_totalnum.getText());
			int cnt = Integer.parseInt(tf_cnt.getText());

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c1 = Calendar.getInstance();
			String today = sdf.format(c1.getTime());


			orderlistInfo vo = new orderlistInfo();
			vo.setMenuname(menuname);
			vo.setOrderCnt(cnt);
			vo.setOrderPri(pri);
			vo.setDate(today);


			try {
				model.insert(vo);
			} catch (SQLException e) {
				System.out.println("입력실패 : "+e.getMessage());
			}

			tf_name.setText(null);
			tf_price.setText(null);
			tf_cnt.setText("1");
			tf_totalnum.setText(null);
			count = 1;

		}
		public void plus() { //+버튼눌렀을때

			int price = Integer.parseInt(tf_price.getText());
			int cnt = Integer.parseInt(tf_cnt.getText());
			int total = price*cnt;
			tf_totalnum.setText(Integer.toString(total));

		}
		public void minus() { //-버튼눌렀을때

			int price = Integer.parseInt(tf_price.getText());
			int cnt = Integer.parseInt(tf_totalnum.getText());
			int total = cnt-price;
			tf_totalnum.setText(Integer.toString(total));

		}
		public void del() { //주문취소버튼 눌렀을때

			tf_name.setText(null);
			tf_price.setText(null);
			tf_cnt.setText("1");
			tf_totalnum.setText(null);
			count = 1;

		}



	}
}

