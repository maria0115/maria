package a_sample;

public class Test3 {

	public static void main(String[] args) {
		String prev = "";
		String pre[] =new String[50];
		
		pre[0]="감자토스트";
		pre[1]="피자토스트";
		pre[2]="피자토스트";
		pre[3]="피자토스트";
		
		for(int i =0; i<4;i++)
		{
			prev+=pre[i];
		}
		System.out.println(prev);

	}

}
