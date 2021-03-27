package DesignPattern;

public class Youtube {

	public static void main(String[] args) {
		
		Channel channel=new Channel("Technical Interview");
		
		User u1=new User("Anindya");
		User u2=new User("Rahul");
		User u3=new User("Testing user");
		
		channel.subscribe(u1);
		channel.subscribe(u2);
		
		channel.videoUpload("Factory Design Pattern");
		

	}

}
