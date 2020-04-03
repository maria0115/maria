package thread.basic;

class Bread 
{
	String bread;

	//##  	

	boolean isCheck = false;
	public void setBread( String bread )
	{
		this.bread = bread;
		//## 		
		isCheck = true;
		synchronized (bread) {
		notifyAll();	//블락되는 애들 다 끄집어 냄//wait는 notify로 끄내줘야함
		}
	}	

	public String getBread()
	{
		//## 		

		if(!isCheck)
		{
			try {
				synchronized (bread) {
					wait();//블락킹 올라가있음	//wait는 notify로 끄내줘야함
				}
				
			} catch (Exception e) {
				
			}
		}
		
		return bread;
	}
}

class Baker extends Thread
{
	Bread bbang;

	Baker( Bread bbang )
	{
		this.bbang = bbang;
	}
	public void run()	//실행실 -> 블락
	{
		bbang.setBread("진열된 완성된 맛있는 빵");
	}
}

class Customer extends Thread
{
	Bread bbang;

	Customer( Bread bbang )
	{
		this.bbang = bbang;
	}
	public void run()
	{
		System.out.println("빵을 사감 : " + bbang.getBread());
	}
}

class Ex8_BreadTest
{
	public static void main(String[] args) 
	{
		Bread  bread = new Bread();

		Baker  baker = new Baker( bread );
		Customer customer = new Customer( bread );
		customer.start();	//대기실	->  실행실run()으로 보냄
		baker.start();

		try{
			customer.join();
			baker.join();						
		}catch( Exception ex ){}

	}
}
