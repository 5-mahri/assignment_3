package assignments3;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		int hours, minutes, seconds, inputSeconds;
		Scanner object=new Scanner(System.in);
		System.out.println("Enter seconds:");
		inputSeconds=object.nextInt();
		
		seconds=inputSeconds%60;
		minutes=inputSeconds/60;
		minutes=minutes%60;
		hours=inputSeconds/3600;
		
		
		System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
	}

}
