package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_Trycatch {

	public static void main(String[] args)
	{
		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("data2.txt");//java와 file저장소와의 가상통로
			System.out.println("파일 연결됨");	//프로젝트에 있어야함
			fis.read();		
			// 배열의 범위를 벗어난 예외가 있을경우
		} 
//		catch (FileNotFoundException e) {		//구체적인 예외처리가 필요할 경우
//			// TODO Auto-generated catch block
//			System.out.println("파일없음예외"+ "");
//		} catch(IOException e)
//		{
//			System.out.println("읽을 때 예외발생");
//		}
		catch(Exception e)
		{
			System.out.println("그 외 예외처리");
		}
		finally
		{
			try {
				System.out.println("닫는다");
				fis.close();	//대부분 finally안에서 close함
			} catch (IOException e) {}
		}
		System.out.println("시스템 정상종료");

	}

}
