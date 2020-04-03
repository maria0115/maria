package network1.basic;


/*
 * **** 멀티프로그래밍(멀티 태스크) 비슷 (멀티 쓰레드)

1. Thread 상속 또는 Runnable 구형
2. run() 오버라이딩
3. run()호출 : start() -> run() 호출됨
 */
public class Ex1_ThreadTest {

	public static void main(String[] args) {
		MakeCar1 work1 = new MakeCar1("차틀만들기");
		 work1.start();	//start() -> run() 호출됨
		 
		 MakeCar1 work2 = new MakeCar1("엔진부착");
		 work2.start();

	}
}

class MakeCar1 extends Thread	//상속
{
	String work;
	
	MakeCar1(String work)
	{
		this.work = work;
	}
	
	public void run()	//오버라이딩
	{
		for(int i=0; i<5;i++)
		{
			System.out.println(work+"작업중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
