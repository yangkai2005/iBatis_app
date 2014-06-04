package net.jee.app;

import java.sql.SQLException;

import com.mydomain.data.SimpleExample;
import com.mydomain.domain.Account;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SimpleExample simpleExample = new SimpleExample();
		Account account = new Account();
		account.setFirstName("yangkai");
		account.setEmailAddress("yangkai_2005@163.com");
		account.setLastName("kai");
		
		try {
			simpleExample.insertAccount(account);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
