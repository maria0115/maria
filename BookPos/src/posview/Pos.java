package posview;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import jfreechartbook.MyFramegenre;
import main.Vo.customerVo;
import main.model.PosModel;

public class Pos extends JFrame  implements ActionListener{

   JButton b_cu_info = new JButton("회원 정보 관리");
   JButton b_before_sell = new JButton("이전 판매 목록");
   JButton b_del = new JButton("삭제");
   JButton b_pay = new JButton("결제");
   JButton b_sales = new JButton("매출");
   JButton b_book_insert = new JButton("입고");
   JButton b_all_del = new JButton("전체 삭제");
   
   BookTableModel bookTM = new BookTableModel();
   JTable search_list = new JTable(bookTM); //책목록
   BookCenterTableModel tbModelcenter = new BookCenterTableModel();
   JTable add_list = new JTable(tbModelcenter); //목록
   BookCuTableModel tbModelBookCu = new BookCuTableModel();
   JTable tableBookCu = new JTable(tbModelBookCu); //회원검색

   JLabel l_search = new JLabel("검색");
   JLabel l_cu_info = new JLabel("검색");
   JTextField tfsearch = new JTextField(10); //책검색을 위한 tf
   JTextField tfcu_info = new JTextField(10);//회원검색을 위한 tf
   JTextField tf_name = new JTextField(10); 
   JTextField tf_tel = new JTextField(10);
   
   //모델단 변수 
   PosModel model; 
   
   customerVo vo;
   
   //vo에 회원 정보받아서 이름,전화번호 가져온상태로 화면 띄워주기 
   public Pos(customerVo vo) {
      this.vo = vo;
      tf_name =new JTextField(vo.getName(),10);
      tf_tel  = new JTextField(vo.getTel(),10);
      display();
      eventProc();
      connectDB();
      bookView();
   }
   
   public Pos() {
      
      display();
      eventProc();
      connectDB();
      bookView();
   }

   
   //화면구성
   public void display() {

      setLayout(new BorderLayout());

      // 상단 버튼 패널
      JPanel p_north = new JPanel(new GridLayout(1, 3));
      JPanel p_north_g = new JPanel(new FlowLayout());
      p_north_g.add(new JLabel("이름"));
      p_north_g.add(tf_name);
      p_north_g.add(new JLabel("번호"));
      p_north_g.add(tf_tel);
      

      p_north.add(p_north_g);
      p_north.add(b_book_insert);
      p_north.add(b_before_sell);
      

      // 하단 버튼 패널
      JPanel p_south = new JPanel(new GridLayout(1,4));
      p_south.add(b_del);
      p_south.add(b_all_del);
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
      p_w_list.add(new JScrollPane(search_list),BorderLayout.CENTER);

      // 오른쪽 라벨+텍스트필드
      JPanel p_e_label = new JPanel(new FlowLayout());
      p_e_label.add(l_cu_info);
      p_e_label.add(tfcu_info);

      // 오른쪽 리스트 패널
      JPanel p_e_list = new JPanel(new BorderLayout());
      p_e_list.setBorder(new TitledBorder("회원 검색"));
      p_e_list.add(p_e_label,BorderLayout.NORTH);
      p_e_list.add(new JScrollPane(tableBookCu),BorderLayout.CENTER);

      // 센터 리스트 패널
      JPanel p_center = new JPanel(new BorderLayout());
      p_center.add(p_w_list,BorderLayout.WEST);
      p_center.add(new JScrollPane(add_list),BorderLayout.CENTER);
      p_center.add(p_e_list,BorderLayout.EAST);
      
      
      
      add(p_north,BorderLayout.NORTH);
      add(p_south,BorderLayout.SOUTH);
      add(p_center,BorderLayout.CENTER);
      
      setLocation(200, 200);
      setSize(1500,700 );
      setVisible(true);

   }
   
   //이벤트 핸들러
   public void eventProc() {
      
      b_before_sell.addActionListener(this);
      b_book_insert.addActionListener(this);
      b_sales.addActionListener(this);
       tfsearch.addActionListener(this);
       tfcu_info.addActionListener(this);
       b_del.addActionListener(this);
       b_pay.addActionListener(this);
       b_all_del.addActionListener(this);
       
       search_list.addMouseListener(new MouseAdapter() {

         public void mouseClicked(MouseEvent e) {

            int row = search_list.getSelectedRow();
            int col = search_list.getSelectedColumn();
            String vnum = (String) search_list.getValueAt(row, col);

            try {
               ArrayList data = model.selectByPK(vnum);
               tbModelcenter.data.add(data);
               add_list.setModel(tbModelcenter);
               tbModelcenter.fireTableDataChanged();

            } catch (Exception ex) {
               System.out.println("추가 실패" + ex.getMessage());
            }
         }
      });
      
   }
   
   
   //이벤트
   public void actionPerformed(ActionEvent e) {
      
      Object evt = e.getSource();
      
      if(evt==b_before_sell) { //이전 판매목록
         new orderList();
      }
      else if(evt==b_book_insert) {//책입고
         
         new Bookinsert();
      }else if(evt == b_sales) {//매출그래프
            MyFramegenre my;
            my = new MyFramegenre();
        }else if(evt == tfsearch) {//책검색
            booksearch();
        }else if(evt==tfcu_info){//회원검색
         searchBook();            
      }else if(evt == b_pay)
      {
         bookpay();
         JOptionPane.showMessageDialog(null, "결제 되었습니다.");
         bookpoint();
         
      }
      else if(evt == b_del)
      {
         bookdelete();
      }else if(evt == b_all_del) {
         tbModelcenter.data.clear();
         add_list.setModel(tbModelcenter);
         tbModelcenter.fireTableDataChanged();
      }
      
   }
   
   //삭제
   public void bookdelete() {
      int i = tbModelcenter.data.size();
      tbModelcenter.data.remove(i - 1);
      add_list.setModel(tbModelcenter);
      tbModelcenter.fireTableDataChanged();
   }
   
   //결제
   public void bookpay() {
      PosModel model = new PosModel();
      ArrayList data = tbModelcenter.data;
      try {
         int i = model.bookpay(data, tf_tel.getText());

      } catch (Exception e) {
         System.out.println("결제 실패" + e.getMessage());

      }

      tbModelcenter.data.clear();
      add_list.setModel(tbModelcenter);
      tbModelcenter.fireTableDataChanged();
   }
   
   // 포인트 적립
   public void bookpoint() {
      try {
         String name = tf_name.getText();
         String tel = tf_tel.getText();

         model.PointSave(name, tel);
      } catch (Exception e) {
         System.out.println("결제실패:" + e.getMessage());
      }
   }
   
   //DB연결
   public void connectDB() {
         try {
            model = new PosModel();
         } catch (Exception e) {
            System.out.println("db 연결실패"+e.getMessage());
         }
      }
   
   //책검색
   public void booksearch() {
         String word = tfsearch.getText();
         
         try {
            ArrayList data = model.selectTitle(word);
            bookTM.data = data;
            search_list.setModel(bookTM);
            bookTM.fireTableDataChanged();
         } catch (SQLException e) {
            System.out.println("북 검색 실패"+e.getMessage());
         }
         
      }
   
   //회원검색
   public void searchBook(){

      String cu = tfcu_info.getText();

      try {
         ArrayList data = model.selectList(cu);

         tbModelBookCu.data = data;

         tableBookCu.setModel(tbModelBookCu);
         tbModelBookCu.fireTableDataChanged();
      } catch (Exception e) {
         System.out.println("비디오 검색 실패"+e.getMessage());
      }

   }
   
   // 책 검색 테이블 현황 출력
   public void bookView() {
      ArrayList data;
      try {
         data = model.Bookview();
         bookTM.data = data;
         search_list.setModel(bookTM);
         bookTM.fireTableDataChanged();
      } catch (SQLException e) {
         System.out.println("북 출력 실패" + e.getMessage());
      }

   }
   
   //회원검색Tablemodel
   class BookCuTableModel extends AbstractTableModel {

      ArrayList data = new ArrayList();
      String[] columnNames = { "이름", "전화번호", "적립포인트" };

      public int getColumnCount() {
         return columnNames.length;
      }

      public int getRowCount() {
         return data.size();
      }

      public Object getValueAt(int row, int col) {
         ArrayList temp = (ArrayList) data.get(row);
         return temp.get(col);
      }

      public String getColumnName(int col) {
         return columnNames[col];
      }
   }
   
   
   //책검색Tablemodel
   class BookCenterTableModel extends AbstractTableModel {

      ArrayList data = new ArrayList();
      String[] columnNames = { "책번호", "제목", "장르", "작가", "가격" };

      public int getColumnCount() {
         return columnNames.length;
      }

      public int getRowCount() {
         return data.size();
      }

      public Object getValueAt(int row, int col) {
         ArrayList temp = (ArrayList) data.get(row);
         return temp.get(col);
      }

      public String getColumnName(int col) {
         return columnNames[col];
      }
   }
   
   //이전구매내역을 위한 Tablemodel
    class BookTableModel extends AbstractTableModel {
         
       ArrayList data = new ArrayList();
       String [] columnNames = {"제목","장르","작가","가격","재고"};

      public int getColumnCount() {
         return columnNames.length;
      }

      public int getRowCount() {
         return data.size();
      }

      public Object getValueAt(int row, int col) {
         ArrayList temp = (ArrayList) data.get(row);
         return temp.get(col);
      }

      public String getColumnName(int col) {
         return columnNames[col];
      }
    }


   





}