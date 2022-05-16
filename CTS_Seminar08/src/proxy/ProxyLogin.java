package proxy;

public class ProxyLogin implements ILoginModule{

	ILoginModule loginModule;
	int counter = 0;

	public ProxyLogin(ILoginModule loginModule) {
		super();
		this.loginModule = loginModule;
	}

	@Override
	public boolean login(String username, String password) {
		if(counter >= 3) {
			System.out.println("Brute force detected");
			return false;
		}
		boolean result = this.loginModule.login(username, password);
		if(!result) {
			counter++;
		}else {
			counter = 0;
		}
		return false;
	}
	
	
}
