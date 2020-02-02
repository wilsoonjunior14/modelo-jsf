package bean;

public class LoginBean {

	public String email;
	public String password;
	
	public void login() {
		System.out.println("Email foi: "+this.email);
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
