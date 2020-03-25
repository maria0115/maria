package c_control;

public class Ex02_if_학번 {

	public static void main(String[] args) {
		String num="2017211001";

		String year = num.substring(0,4);

		char dae = num.charAt(4);
		System.out.println(dae);

		String gua = num.substring(5,7);
		System.out.println(gua);
		int gua2=Integer.parseInt(gua);
		String aa="",b="";	//String은 초기값 잡으려면 ""

		if(dae=='1')
		{
			aa="공대";
			if(gua2 == 11)	//gua2.equals("11") , 문자열을 비교할때 무조건 써줘야지

			{b="컴퓨터학과";}
			else if(gua2==12)
			{
				b="소프트웨어학과";
			}
			else if(gua2==13)
			{
				b="모바일학과";
			}
			else if(gua2==22)
			{
				b="자바학과";
			}
			else if(gua2==33)
			{
				b="서버학과";
			}


		}else if(dae=='2') 
		{
			aa="사회대";

			if(gua2==11)
			{
				b="사회학과";
			}
			else if(gua2==12)
			{
				b="경영학과";
			}
			else if(gua2==13)
			{
				b="경제학과";
			}

		}
		else
		{aa="대학아님";}

		System.out.println(aa);

		System.out.println(b);
		System.out.println(num+" 는 "+year+"년도에 입학한 "+aa+" "+b+ " 학생입니다");

		String hak="";



		if(dae=='1')
		{
			aa="공대";
			switch(gua2)
			{
			case 11 : hak="컴퓨터학과"; break;
			case  12 :hak="소프트웨어학과";break;
			case  13 :hak="모바일학과";break;
			case  22 :hak="자바학과";break;
			case 23 :hak="서버학과";break;
			}


		}else if(dae=='2') 
		{
			aa="사회대";

			switch(gua)
			{
			case "11" : hak="사회학과"; break;
			case  "12" :hak="경영학과";break;
			case  "13" :hak="경제학과";break;

			}

		}

		System.out.println(hak);


	}

}
