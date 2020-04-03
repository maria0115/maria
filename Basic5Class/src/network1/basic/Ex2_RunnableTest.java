package network1.basic;

public class Ex2_RunnableTest {

	public static void main(String[] args) {
		MakeCar2 mc1= new MakeCar2("차틀만들기");
		Thread t1 = new Thread(mc1);	
		// runnable에는 start함수가 없음 그래서 의미없이 thread 구현후 내 클래스  넣어줌
		t1.start();
		//MakeCar2 mc2= ;
		
		new Thread(new MakeCar2("엔진부착")).start();
		//System.out.println("작업끝");
	}

}
class MakeCar2 implements Runnable
{
	String work;
	MakeCar2(String work)
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