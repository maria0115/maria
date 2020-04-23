package posview;

import java.awt.BorderLayout;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import main.model.PosModel;

public class orderList extends JFrame{

	JTable orlist ;
	orderListModel orlistTM;
	//모델단 변수
	PosModel model;
	 
	public orderList() {
		
		setLayout();
		connectDB();
		selectList();
		
	}
	
	void connectDB(){
		
		try {
			model = new PosModel();
			
		} catch (Exception e) {
			System.out.println("매출관리 연결실패 : "+e.getMessage());
		}
		
	}
	
	void setLayout() {
		
		setLayout(new BorderLayout());
		orlistTM = new orderListModel();
		orlist = new JTable(orlistTM);
		
		
		add(new JScrollPane(orlist),BorderLayout.CENTER);
		
		setLocation(200, 200);
		setSize(700,700 );
		setVisible(true);
		
	}

	
	void selectList() { //이전구매목록 띄워주기 
		try {
			
			ArrayList data = new ArrayList();
			data = model.selectList();
			orlistTM.data = data;
			orlist.setModel(orlistTM);
			orlistTM.fireTableDataChanged();
			
		} catch (Exception e) {
			System.out.println("이전구매목록 검색실패"+e.getMessage());
		}
		
	}
	

	
	
	//이전구매목록을 위한 
	class orderListModel extends AbstractTableModel{
		
		ArrayList data = new ArrayList();
		String [] columnNames = {"주문날짜","결제금액","주문고객","책제목"};
		
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
