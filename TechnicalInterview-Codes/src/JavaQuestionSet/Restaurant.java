package JavaQuestionSet;


public class Restaurant {
	
//	static class Kitchen implements Runnable {
//		
////		public void run() {
////			
////			System.out.println("\n\nOrder taken");
////			prepareFood();
////			
////		}
//		static String lock="LOCK";
//		
//		public static  void prepareFood() { //Critical Section
//			
//			System.out.println("Within the kitchen");
//			
//			synchronized(lock) {		
//					System.out.println("Food preparation: STARTED "+Thread.currentThread().getName());
//					
//					//System.out.println(Thread.currentThread().getName());
//					try {
//						
//						Thread.sleep(3000);
//						
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					
//					System.out.println("Food preparation: DONE "+Thread.currentThread().getName());
//			}
//		}
//
//		@Override
//		public void run() {
//			System.out.println("\n\nOrder taken " +Thread.currentThread().getName());
//			prepareFood();
//			
//		}
//		
//	}
	
	public static void main(String[] args) {
		
		String lock="LOCK";
		
		Runnable runnable=new Runnable() {
			
			public void prepareFood() { //Critical Section				
				System.out.println("Within the kitchen");				
				synchronized(lock) {		
						System.out.println("Food preparation: STARTED "+Thread.currentThread().getName());
						try {
							
							Thread.sleep(3000);
							
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						System.out.println("Food preparation: DONE "+Thread.currentThread().getName());
				}
			}
			@Override
			public void run() {
				System.out.println("\n\nOrder taken " +Thread.currentThread().getName());
				prepareFood();
				
			}
		};
		
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		
		t1.start();
		t2.start();
		
		
		
		
//		Kitchen kitchen=new Kitchen();
//		Thread thread1=new Thread(kitchen);
//		thread1.start();
//		
//		Kitchen kitchen2=new Kitchen();
//		Thread thread2=new Thread(kitchen2);
//		thread2.start();
//		
//		Kitchen kitchen3=new Kitchen();
//		Thread thread3=new Thread(kitchen3);
//		thread3.start();

	}

}
