package demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import housemanager.bean.Username;
import housemanager.service.UserService;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext cotext = new ClassPathXmlApplicationContext("/app-dao.xml","/app-service.xml");
//	Username user1 = (Username)cotext.fin
//	user1.setUname("发平");
//	user1.setPassword("123456");
	
	UserService user = (UserService)cotext.getBean("user");
	Username user1 = user.load(3);
//	System.out.println(user1);
	user1.setUname("发平");
	user1.setPassword("123");
	user.update(user1);
	for (Object obj : user.findAll()) {
		System.out.println(obj);
	}
	
	}

}
