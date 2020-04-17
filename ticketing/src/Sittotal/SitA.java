package Sittotal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import main.Mainpage;
import ticketing.GeneralReservation;
import vo.Consert_vo;

public class SitA extends JPanel implements ActionListener{
	
	JButton [] jbs1 = new JButton[300]; //좌석을 위한 버튼
	JLabel jl1;
	Sitmain parent;
	GeneralReservation grandparent;
	JTextArea ta;

	public SitA(Sitmain parent, GeneralReservation grandparent) {
		this.parent = parent;
		this.grandparent =grandparent;
		setLayout();	
		eventProc();
	}
	
	public SitA(GeneralReservation gr) {
		
	}

		public void setLayout() {
		
				//A구역 
				setLayout(new BorderLayout());
				JPanel jp1 = new JPanel(new GridLayout(10, 30));
				jl1 = new JLabel("A구역");
				jl1.setFont(jl1.getFont().deriveFont(30.0f));
				int h = 1;
				char j='A'-1;
				for(int i=0; i<jbs1.length ; i++) {
					if(i%30==0)
					{
						j = (char) (j+1);
						h=1;
					}
					jbs1[i] = new JButton(j+String.valueOf(h)); 
					jbs1[i].setBackground(Color.gray);
					h++;
				}
				
				
				for(int i=0 ; i<jbs1.length ; i++) {
					jp1.add(jbs1[i]);
				}
				
				add(jl1,BorderLayout.NORTH);
				add(jp1,BorderLayout.CENTER);
		
	}

		public void actionPerformed(ActionEvent e) {
			JButton ev = (JButton)e.getSource();
			
			for(int i=0; i<jbs1.length ; i++) {
				if(ev == jbs1[i])
				{
					String seat = jbs1[i].getText();
					int s = JOptionPane.showConfirmDialog(null, seat+" 좌석을 선택하시겠습니까","좌석 선택",JOptionPane.YES_NO_OPTION);
					
					if(s == 0)
					{
						ta = new JTextArea();
						parent.setVisible(false);
						Consert_vo cv = new Consert_vo();
						cv.setSeat(seat);
						grandparent.setResult_conname(seat);
						ta.setText(grandparent.getResult_conname());
						grandparent.setTa(ta);
						
						
					
			
						// 확인버튼을 누르는 지금 이 순간에 vo에 있는 값들을 ta에
						// 넣고 싶다.
						
					}

				}
			}	
		}	
		
		void eventProc()
		{
			for(int i=0; i<jbs1.length ; i++) {
				jbs1[i].addActionListener(this);
			}
		}

}


