package mailing;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendMail {



	    public static void main(String[] args) {
	        String to = "kim.silvina@gmail.com";  //수신인 주소
	        String user = "rkddpdms12@naver.com";  //발신인 주소
	        String password = "rhemddj21^";
	        Properties props = new Properties();
	        Session session = Session.getInstance(props);
	        try {
	         MimeMessage msg = new MimeMessage(session); //메세지 내용 담당 클래스인 MimeMessage 객체 생성
	            msg.setFrom(new InternetAddress(user));    //발신자 의 IP
	            InternetAddress address = new InternetAddress(to);//수신자의 IP (수신자가 다수일 경우 배열로 선언)
	            msg.setRecipient(Message.RecipientType.TO, address);
	            msg.setSubject("강예은 메일 테스트입니다 "); 
	            msg.setText("강예은의 메일 성공입니다.");
	            Transport.send(msg);             //메일발송
	        }
	        catch (MessagingException mex) {
	            mex.printStackTrace();
	        }
	        catch (Exception e) {}
	    }


}
