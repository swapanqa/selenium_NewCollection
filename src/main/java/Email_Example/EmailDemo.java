package Email_Example;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailDemo {

	public static void main(String[] args) throws EmailException {
		
	System.out.println("Email send to start====================================");	
		

        emailSend();
		
		
	System.out.println("Email end=============================================");	
		
		

	}

	public static void emailSend() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("mautoitqa786@gmail.com", "shafee2013"));
		email.setSSLOnConnect(true);
		email.setFrom("mautoitqa786@gmail.com");
		email.setSubject("Selnium TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("mautoitqa786@gmail.com");
		email.send();
	}

}
