package Food;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;


import jfreechart.MyFrame;
import main.model.SnackModel;

public class foodTotal extends JFrame{
	
	JTable foodlist;
	JButton jbnt = new JButton("매출조회");
	foodTableModel foodTM;
	 
	 
	//모델단 변수 선언
	SnackModel model;


	public foodTotal() {
		
		setLayout(); //화면구성
		connectDB();
		selectList();//매출목록보여주기
		eventProc();
	}
	
	void connectDB(){
		
		try {
			model = new SnackModel();
			
		} catch (Exception e) {
			System.out.println("매출관리 연결실패 : "+e.getMessage());
		}
		
	}
	
	void setLayout() { //매출목록,버튼 보여주기 
		
		setLayout(new BorderLayout());
		foodTM = new foodTableModel();
		foodlist = new JTable(foodTM);
		
		add(new JScrollPane(foodlist),BorderLayout.CENTER);
		add(jbnt, BorderLayout.NORTH);
		
		setLocation(200, 200);
		setSize(700,700 );
		setVisible(true);
		
	} 
	
	void selectList() { //음식 매출 목록 
		
		try {
			
			ArrayList data = new ArrayList();
			data = model.selectList();
			foodTM.data = data;
			foodlist.setModel(foodTM);
			foodTM.fireTableDataChanged();
			
		} catch (Exception e) {
			System.out.println("미납목록 검색실패"+e.getMessage());
		}
		
	}
	
	public void eventProc() {
		
		//매출조회 버튼을 눌렀을때
		jbnt.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				JButton evt = (JButton)e.getSource();
				try {
					MyFrame mf = new MyFrame();
				} catch (Exception e1) {
					System.out.println("그래프 예외발생"+e.getActionCommand());
				}
				
			}
		});
		
	}

	//매출관리를 위한 Tablemodel
	class foodTableModel extends AbstractTableModel{
		
		ArrayList data = new ArrayList();
		String [] columnNames = {"주문날짜","메뉴이름","결제금액"};
		
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
