package assignments3;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		num1=10;
		num2=20;
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
        
		System.out.println("n1="+num1);
		System.out.println("n2="+num2);
		
		int a1=5, a2=15;
		a1=a1+a2-(a2=a1);
		System.out.println("a1 is "+a1+"\n"+"a2 is "+a2);
		
		int b1=25, b2=30, swap;
		swap=b1;
		b1=b2;
		b2=swap;
		System.out.println("b1=" + b1 + "\n" + "b2=" + b2);

	}

}
