package DesignPattern;

public class SingletonMain {

	static class Singleton {
		private static Singleton instance;

		private Singleton() {}

		public static synchronized Singleton getInstance() {
			
			if (instance == null) {
				instance=new Singleton();
				System.out.println("Object getting created");
			}
			return instance;
		}
		
		public void doSomeOperation() {
			System.out.println("Do some operation");
		}

	}

	public static void main(String[] args) {

		Singleton instance=Singleton.getInstance();
		instance.doSomeOperation();
		
		Singleton instance2=Singleton.getInstance();
		instance2.doSomeOperation();	
	}

}

