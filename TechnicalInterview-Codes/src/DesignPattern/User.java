package DesignPattern;

public class User implements Observer{

	private String userName;
	
	User(String userName) {
		this.userName=userName;
	}
	
	@Override
	public void update(String message) {
		System.out.println("Hey, "+userName+" checkout the new video==> "+message);
	}

}
