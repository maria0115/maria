package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> lottos = new HashSet<Integer>();	//중복되지 않음
	
		// 변수명은 lotto
		
		int lotto=0;
		while(lottos.size()<6)
		{
			//Math.random();	//0<=x<1

			lotto= (int)(Math.random()*45)+1;		//double형이니까 int로 캐스팅해서 소수점 자르기
			lottos.add(lotto);
		}
		System.out.println(lottos);

		ArrayList<Integer> list = new ArrayList<Integer>(lottos);
		Collections.sort(list);
		System.out.println(list);


		
	}
}
