package DesignPattern;

public class StrategyDesignPatter {
	
	static interface Payment {
		void collectPaymentDetails();
		void doPayment();
	}
	
	static class CreditCard implements Payment {

		@Override
		public void collectPaymentDetails() {
			System.out.println("Enter credit card number, expire date, cvv number");
			
		}
		@Override
		public void doPayment() {
			System.out.println("Payment done suceessfully by Credit Card");
			
		}
	}
	
	static class GooglePay implements Payment {

		@Override
		public void collectPaymentDetails() {
			System.out.println("Enter the google phone number, and pin");
			
		}

		@Override
		public void doPayment() {
			System.out.println("Payment done successfully by GPAY");
		}		
	}
	
	
	static class Order {
		
		int orderID;
		int value;
		Payment method;
		
		public Order(int orderID, int value, Payment method) {
			super();
			this.orderID = orderID;
			this.value = value;
			this.method = method;
		}
		
		public void placeOrder() {
			method.collectPaymentDetails();
			method.doPayment();
		}
		
		
	}

	public static void main(String[] args) {
		
		Payment cc=new CreditCard();
		Payment gPay=new GooglePay();
		
		
		
		Order order=new Order(10000, 19000, cc);
		order.placeOrder();
		

	}

}
