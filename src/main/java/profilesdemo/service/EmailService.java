package profilesdemo.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
	
	public EmailService() {
		System.out.println("EmailService created");
		
	}
	
	public void sendEmail(String from, String to, String body) {
		System.out.println("email sent from: " + from);
		System.out.println("email sent to: " + to);
		System.out.println("email body: " + body);
	}
}
