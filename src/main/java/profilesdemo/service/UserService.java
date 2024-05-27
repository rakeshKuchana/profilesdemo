package profilesdemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	private EmailService emailService;
	
	public UserService(EmailService emailService) {
		System.out.println("UserService Created");
		this.emailService = emailService;
	}

	@Value("${xyz.email.from}")
	private String from;
	
	@Value("${xyz.email.clientDL}")
	private String to;
	
	
	public void sendEmail() {
		emailService.sendEmail(from, to, "Hi");
	}

}
