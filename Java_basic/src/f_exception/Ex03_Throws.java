package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex03_Throws {

	public static void main(String[] args) {
		try	//throws를 하더라도 마지막 단 한번은 우리에게 인식가능하게 try사용
		{
		readFile();
		System.out.println("파일처리 성공");
	
	}catch(Exception ex)
		{
		System.out.println("실패");
		}
		}

	static void readFile() throws Exception	//모든일에 예외처리
	{
		FileInputStream fis = new FileInputStream("add.txt");
		System.out.println("파일 연결됨");
		
	}
}
