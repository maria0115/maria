/*
 * 자료형 관련 클래스 : Wrapper class
 *   Byte / Short
 *   Character
 *   Integer / Long
 *   Float / Double
 *   
 *   형변환 관련하여 ...
 *   
 *   *** String -> int 형
 *   	Integer.parseInt()
 *   
 *   *** int -> String
 *   	"" + 10 -> "10"
 *   	String.valueOf(10) -> "10"
 */


package c_collection;
import java.util.ArrayList;

class aArrayListEx0
{
	public static void main(String[] args) 
	{
		Object []o = dataSet();
		
		for(int i =0; i<o.length;i++)
		{
			System.out.println(o[i]);
		}
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		
	}

	static Object[] dataSet()
	{
		String	name = "내이름은이하늬";
		int		age = 31;
		double	height = 162.3;


		//기본형을 클래스로 변환
		Object  [] data = new Object[3];
		data[0] = name;
		data[1] = new Integer(age); //int -> Integer
		data[2] = new Double(height);
		//System.out.println(data);
		return data;

	}
}
