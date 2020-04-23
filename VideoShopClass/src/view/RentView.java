package  view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import model.dao.RentModel;



public class RentView extends JPanel 
{
	JTextField tfRentTel, tfRentCustName, tfRentVideoNum;
	JButton bRent;
	
	JTextField tfReturnVideoNum;
	JButton bReturn;
	
	JTable tableRecentList;
	
	RentTableModel rentTM;
	
	//모델단 변수 선언
	RentModel model;

	
	//==============================================
	//	 생성자 함수
	public RentView(){
		addLayout();	//화면구성
		eventProc();	
		connectDB();	//DB연결
		selectList();
	}
	void selectList() {
	      try {
//	         ArrayList data = model.selectList();
//	         rentTM.data = data;
	         rentTM.data = model.selectList();
	         tableRecentList.setModel(rentTM);
	         rentTM.fireTableDataChanged();
	      } catch (Exception e) {
	         System.out.println("미납 목록 검색 실패:"+e.getMessage());
	      }
	   }
	
	// DB 연결
	void connectDB(){
		try {
			model = new RentModel();
		} catch (Exception e) {
			System.out.println("대여관리 오라클 드라이버 실패"+e.getMessage());
		}
	}
	
	
	// 이벤트 등록
	public void eventProc(){
		BtnHandler handler = new BtnHandler();
		tfRentTel.addActionListener(handler);
		bRent.addActionListener(handler);
		bReturn.addActionListener(handler);
		                         
	}
	
	//이벤트 핸들러
	class BtnHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			Object ev = e.getSource();

			if(ev==tfRentTel)
			{
				selectBytel();
			}
			else if(ev ==bRent)
			{
				rentVideo();
				selectList();
			}
			else if(ev == bReturn)
			{
				returnVideo();
				selectList();
			}
			
		}
		void selectBytel()
		{
			String tel = tfRentTel.getText();
			String coname="";
			try {
				coname = model.selectBytel(tel);
			} catch (Exception e) {
				System.out.println("전화번호 셀렉트 실패"+e.getMessage());
			}
			tfRentCustName.setText(coname);
			
		}
		//대여버튼이 눌렸을 때 
		void rentVideo()
		{
			String tel=tfRentTel.getText();
			int vnum=Integer.parseInt(tfRentVideoNum.getText());
			try {
				model.rentVideo(tel, vnum);
			} catch (Exception e) {
				System.out.println("대여실패"+e.getMessage());
			}
			//화면초기화
			tfRentTel.setText("");
			tfRentCustName.setText(""); 
			tfRentVideoNum.setText("");
		}
		
		void returnVideo()
		{
			int vnum=Integer.parseInt(tfReturnVideoNum.getText());
			try {
				int retur = model.returnVideo(vnum);
				if(retur==0)
				{
					JOptionPane.showConfirmDialog(null, "반납되었습니다");
				}
			} catch (Exception e) {
				System.out.println("반납실패"+e.getMessage());
			}
			//화면초기화
			tfRentTel.setText("");
			tfRentCustName.setText(""); 
			tfRentVideoNum.setText("");
		}
		
		
	}
	
	/*	객체 생성 및 화면 구성   */
	void addLayout(){

		tfRentTel = new JTextField();
		tfRentCustName = new JTextField();
		tfRentVideoNum = new JTextField();
		bRent = new JButton("대여");
		bReturn = new JButton("반납");
		tfReturnVideoNum = new JTextField(10);

		rentTM = new RentTableModel();
		tableRecentList = new JTable(rentTM);
		
		setLayout(new BorderLayout());
		JPanel p_north = new JPanel(new GridLayout(1,2));
		
			JPanel p_north_left = new JPanel(new GridLayout(4,2));
			p_north_left.setBorder(new TitledBorder("대여"));
			p_north_left.add(new JLabel("전화번호"));
			p_north_left.add(tfRentTel);
			p_north_left.add(new JLabel("고객명"));
			p_north_left.add(tfRentCustName);
			p_north_left.add(new JLabel("비디오 번호"));
			p_north_left.add(tfRentVideoNum);
			p_north_left.add(bRent);
			p_north_left.add(new JLabel());
			JPanel p_north_right = new JPanel();
			p_north_right.setBorder(new TitledBorder("반납"));
			p_north_right.add(new JLabel("비디오 번호"));
			p_north_right.add(tfReturnVideoNum);
			p_north_right.add(bReturn);
			
		p_north.add(p_north_left);
		p_north.add(p_north_right);
		
				
		add(new JScrollPane(tableRecentList), BorderLayout.CENTER);
		add(p_north, BorderLayout.NORTH);
	}

	class RentTableModel extends AbstractTableModel { 
		  
		ArrayList data = new ArrayList();
		String [] columnNames = {"비디오번호","제목","고객명","전화번호","대여일","반납일"};

			public int getColumnCount() { 
		        return columnNames.length; 
		    } 
		     
		    public int getRowCount() { 
		        return data.size(); 
		    } 

		    public Object getValueAt(int row, int col) { 
				ArrayList temp = (ArrayList)data.get( row );
		        return temp.get( col ); 
		    }
		    
		    public String getColumnName(int col){
		    	return columnNames[col];
		    }
	}

	

	
}
