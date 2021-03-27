package DesignPattern;


	
	interface Shape {
		void getColor();
		void getPoint();
	}
	
	class GreenBox implements Shape {
		
		@Override
		public void getColor() {
			System.out.println("Green Box");
		}
		
		@Override
		public void getPoint() {
			System.out.println("Point 2");
		}
	}
	
	class RedBox implements Shape {
		
		@Override
		public void getColor() {
			System.out.println("Reg Box");
		}
		
		@Override
		public void getPoint() {
			System.out.println("Point 4");
		}
	}
	
	class GameDriver {
		
		public Shape createGameObject(String color) {
			switch(color) {
				case "RED": return new RedBox();
				case "GREEN" : return new GreenBox();
			}
			return null;
		}
	}
	
	public class FactoryPatternDemo {
		
		public static void main(String args[]) {
			
			GameDriver gDrive=new GameDriver();
			
			for(int i=0;i<50;i++) {
				
				if(Math.ceil(Math.random()*100)%2 == 0) {
					gDrive.createGameObject("RED").getPoint();
					System.out.println(" for RED block");
				}else {
					gDrive.createGameObject("GREEN").getPoint();
					System.out.println(" for the Green block");
				}
			}
			
			
			
		}
	
}
