package thread.basic;

class Count
{ 
	int i;
	void increment()
	{
		synchronized(this)	//블럭	//this
		{
		i++;
		}
		//다른 코딩이 많은 경우
	}
}
class ThreadCount extends Thread
{
	Count cnt;
	
	ThreadCount(Count cnt)
	{
		this.cnt=cnt;
	}
	
	public void run()
	{
		for(int i=0; i<10000000; i++)
		{//				10014263
			cnt.increment();
		}
	}
	
	
}
public class Ex05_SynchTest {

	public static void main(String[] args) {
		
		Count cnt = new Count();
		ThreadCount tc1 = new ThreadCount(cnt);
		tc1.start();
		ThreadCount tc2 = new ThreadCount(cnt);
		tc2.start();
		
		try {
			tc1.join();	//내가 실행한 쓰레드를 기다리게 하는
			tc2.join();
		} catch (Exception e) {
			
		}
		
		System.out.println(cnt.i);
	}

}
