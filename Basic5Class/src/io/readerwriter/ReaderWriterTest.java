package io.readerwriter;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReaderWriterTest
{
	public static void main( String args[])
	{
		UIForm3 ui = new UIForm3();
		ui.addLayout();
		ui.eventProc();	
	}	
}

//========================================
//	화면을 관리하는 클래스 
//----------------------------------------
class UIForm3 extends JFrame
{
	JTextArea	ta;
	JButton 		bSave, bLoad, bClear;
	
	UIForm3()
	{
		ta		= new JTextArea();		
		bSave 	= new JButton("파일저장");
		bLoad	= new JButton("파일읽기");
		bClear	= new JButton("화면지우기");
	}
	
	void addLayout()
	{
		JPanel pCenter 	= new JPanel();
		pCenter.setLayout( new BorderLayout() );
		pCenter.add("Center", new JScrollPane(ta) );	//스크롤을 가지고 있는 판때기
	
		JPanel pSouth	= new JPanel();
		pSouth.add( bSave );
		pSouth.add( bLoad );
		pSouth.add( bClear );
		
		getContentPane().add("Center", pCenter );
		getContentPane().add("South",  pSouth );
		
		setSize( 400, 350 );
		setVisible( true );
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	void eventProc()
	{
		EventHandler hdlr = new EventHandler();
		
		bSave.addActionListener(hdlr);
		bLoad.addActionListener(hdlr);
		bClear.addActionListener(hdlr);
		
	}
	
	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object evt = ev.getSource();
			
			// "화일저장" 버튼이 눌렸을 때 
			if( evt == bSave){
				JFileChooser fd = new JFileChooser();
				int returnValue = fd.showSaveDialog( null );
				if( returnValue == JFileChooser.APPROVE_OPTION )	//저장버튼이 눌려졌을때
				{
					File f = fd.getSelectedFile();	//사용자가 입력한 파일 정보
					try{
						/** 
						 * @@@@@@@@@@@@@@@@@@@@@@@@@
						 * */
						String msg = ta.getText();
						
						FileWriter fw = new FileWriter(f);	//글이면writer로 저장
						fw.write(msg);
						fw.close();
						
						
						
					}catch(Exception ex){
						System.out.println("저장 실패");
					}	
				}
			}
			else if(evt == bLoad)	//파일읽기 버튼을 눌렀을 때
			{
				JFileChooser fd = new JFileChooser();	//파일선택하는 객체 생성
				int returnValue = fd.showOpenDialog( null );
				if( returnValue == JFileChooser.APPROVE_OPTION )	//열기버튼이 눌려졌을때
				{
					File f = fd.getSelectedFile();	//사용자가 입력한 파일 정보
					try{
						/** 
						 * @@@@@@@@@@@@@@@@@@@@@@@@@
						 * */
						FileReader fr = new FileReader(f);	//글이면writer로 저장
						
						char []data = new char[1024*3];
						fr.read(data);	//data에 내용을 담아줌 char형태
						ta.setText(String.valueOf(data));
						fr.close();
						
						
						
					}catch(Exception ex){
						System.out.println("저장 실패");
					}	
				}
			}
			else if(evt == bClear)	//파일읽기 버튼을 눌렀을 때
			{
				
						ta.setText(" ");
						
			}
			// "화일읽기" 버튼이 눌렸을 때 
			
		}
	}
}