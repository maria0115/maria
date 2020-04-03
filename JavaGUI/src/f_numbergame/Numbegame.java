package f_numbergame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Numbegame {

	public static void main(String[] args) {
		NumberGametest num = new NumberGametest();
		num.initChar();
		num.showAnswer();
		
	
		

	}

}

class NumberGametest extends JFrame implements ActionListener
{//1. 멤버변수 선언
	int getsu = 4;
	
	JButton [][]jb = new JButton[getsu][getsu];
	
	//2. 버튼위에 지정할 문자변수
	char [][]answers = new char[getsu][getsu];	//char '\u0000' - 자동 초기화시
	
	// 5. 첫번째 버튼에 대한 저장
	JButton firstclick;
	int firstrow,firstcol;
	
	NumberGametest()
	{
		//2. 객체 생성
		//3. 화면 구성
		
		setLayout(new GridLayout(getsu,getsu));
		
		for(int j = 0; j<getsu;j++)
		{
			for(int i = 0; i<getsu;i++)
			{
				
				jb[j][i] = new JButton(j+":"+i);
				add(jb[j][i]);
				
				answers[i][j] = '0';
				//이벤트 연결
				jb[j][i].addActionListener(this);
			}
		}
		
		
		
		//화면 출력
		setSize(500,500);
		setVisible(true);
		setLocation(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//임의의 알파벳을 임의의 위치에 지정	
	void initChar()
	{
		char alpha ='0';
		HERE:
		for(int i=0; i<getsu*getsu;)
		{
			//임의의 알파벳을 만들기
			
			if(i%2==0)
			{
				alpha = (char) ('A'+(int)(Math.random()*26));
				//기존에 이미 이 알파벳이 있는 지 확인
				
				for(int low = 0; low<getsu;low++)
				{
					for(int col = 0; col<getsu;col++)
					{
						if(answers[low][col]==alpha)
						{
							continue HERE;
						}
					}
				}
			}
			
			//임의의 위치 선정하기
			boolean okay = false;
			do 
			{
				int row = (int)(Math.random()*getsu);
				int col = (int)(Math.random()*getsu);
				
				if(answers[row][col]=='0')
				{
					answers[row][col] = alpha;
					i++;
					okay = true;
				}
				
			}while(!okay);
		}
	}
	
	void showAnswer()
	{
		String change = "";
		//답보여주기
		for(int j = 0; j<getsu;j++)
		{
			for(int i = 0; i<getsu;i++)
			{
				change = Character.toString(answers[i][j]);	//stringvalueof
				jb[i][j].setText(change);
			}
		}
		
		
		//1분후 답가리기
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
		}
		for(int j = 0; j<jb.length;j++)
		{
			for(int i = 0; i<jb[j].length;i++)
			{
				jb[i][j].setText(null);
				
			}
		}
	}

	
	public void actionPerformed(ActionEvent e) {
		//System.out.println("이벤트 확인");
		JButton evt = (JButton)e.getSource();
		
		for(int j = 0; j<getsu;j++)
		{
			for(int i = 0; i<getsu;i++)
			{
				if(jb[j][i]==evt)
				{
					//evt.setBackground(Color.pink);
					
					//첫번째 선택인가
					if(firstclick ==null)
					{
						firstclick = evt;
						firstrow = j;
						firstcol = i;
						evt.setBackground(Color.pink);
						evt.removeActionListener(this);
					}
					else
					{						
						//두번째 선택
						//두개의 문자가 같다면
						if(answers[j][i]==answers[firstrow][firstcol])
						{
							
							
							firstclick.setBackground(Color.red);
							evt.setBackground(Color.red);
						}
						else
						{
							firstclick.setBackground(null);
						}
						//evt.addActionListener(this);
						firstclick =null;
						//evt.setBackground(Color.darkGray);
					}
				}
			}
		}
	}
}
