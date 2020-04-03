package h_inherit3;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Item i =null;
//		  Book b = null;
//		  Dvd  d = null;
//		  Cd   c = null;
		  
		  Scanner input = new Scanner(System.in);
		  System.out.println("상품선택(1. Book  2.Dvd   3.Cd");
		  int sel = input.nextInt();
		  switch(sel) {
		  case 1: i = new Book("0001","자바","홍길동","코스모"); break;
		  case 2: i = new Dvd("002","킹덤","주지훈","김은희"); break;
		  case 3: i = new Cd("00001","아는노래","지코"); break;
		  }
		  // 출력*****
		  i.output();
//		  switch(sel) {
//		  case 1: b.output(); break;
//		  case 2: d.output(); break;
//		  case 3: c.output(); break;
//		  }

	}
	

}
