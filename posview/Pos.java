package posview;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Pos extends JPanel  {

	JButton b_insert = new JButton("회원 가입");
	JButton b_cu_info = new JButton("회원 정보 관리");
	JButton b_before_sell = new JButton("이전 판매 목록");
	JButton b_add = new JButton("선택");
	JButton b_del = new JButton("삭제");
	JButton b_pay = new JButton("결제");
	JButton b_sales = new JButton("매출");

	JList search_list = new JList();
	JTable add_list = new JTable();
	JList cu_list = new JList();

	JLabel l_search = new JLabel("검색");
	JLabel l_cu_info = new JLabel("검색");
	JTextField tfsearch = new JTextField(10);
	JTextField tfcu_info = new JTextField(10);

	public Pos()
	{
		display();
	}

	public void display() {

		setLayout(new BorderLayout());

		// 상단 버튼 패널
		JPanel p_north = new JPanel(new GridLayout(1,2));
		p_north.add(b_insert);
		p_north.add(b_before_sell);

		// 하단 버튼 패널
		JPanel p_south = new JPanel(new GridLayout(1,4));
		p_south.add(b_add);
		p_south.add(b_del);
		p_south.add(b_pay);
		p_south.add(b_sales);

		// 왼쪽 라벨+텍스트필드
		JPanel p_w_label = new JPanel(new FlowLayout());
		p_w_label.add(l_search);
		p_w_label.add(tfsearch);

		// 왼쪽 리스트 패널
		JPanel p_w_list = new JPanel(new BorderLayout());
		p_w_list.setBorder(new TitledBorder("책 검색"));
		p_w_list.add(p_w_label,BorderLayout.NORTH);
		p_w_list.add(search_list,BorderLayout.CENTER);

		// 오른쪽 라벨+텍스트필드
		JPanel p_e_label = new JPanel(new FlowLayout());
		p_e_label.add(l_cu_info);
		p_e_label.add(tfcu_info);

		// 오른쪽 리스트 패널
		JPanel p_e_list = new JPanel(new BorderLayout());
		p_e_list.setBorder(new TitledBorder("회원 검색"));
		p_e_list.add(p_e_label,BorderLayout.NORTH);
		p_e_list.add(cu_list,BorderLayout.CENTER);

		// 센터 리스트 패널
		JPanel p_center = new JPanel(new BorderLayout());
		p_center.add(p_w_list,BorderLayout.WEST);
		p_center.add(add_list,BorderLayout.CENTER);
		p_center.add(p_e_list,BorderLayout.EAST);
		
		add_list.setBorder(new TitledBorder("목록"));
		
		
		add(p_north,BorderLayout.NORTH);
		add(p_south,BorderLayout.SOUTH);
		add(p_center,BorderLayout.CENTER);




	}






}
