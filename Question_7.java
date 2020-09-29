package assignments3;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int change, quarters, dimes, nickles, billPay=1;
		int price=95;
		System.out.println("Price in cents:"+price);
		
		change=(billPay*100)-price;
		nickles=change/5;
		dimes=change/10;
		quarters=change/25;
		System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickles+" nickles");
		
		
	 
	 
	 
	}

}
