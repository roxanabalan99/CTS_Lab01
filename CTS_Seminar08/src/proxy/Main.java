package proxy;

public class Main {

	public static void main(String[] args) {
		
		LoginModule loginModule = new LoginModule("admin", "1234");
		String [] dictionarPasswords = new String [] {"12345678","123456","root","1234","56789"};
		
		for(String password: dictionarPasswords) {
			if(loginModule.login("admin", password)) {
				System.out.println("FOUND IT "+password);
			}
		}
		
		//
		System.out.println("---------------------");
		ProxyLogin proxyLogin = new ProxyLogin(loginModule);
		for(String password: dictionarPasswords) {
			if(proxyLogin.login("admin", password)) {
				System.out.println("Found it!");
			}
		}

	}

}
