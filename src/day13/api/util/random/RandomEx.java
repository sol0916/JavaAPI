package day13.api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		//double d = Math.random();
		
		Random r = new Random();
		
		double d = r.nextDouble();
		System.out.println(d);
		
		int x = r.nextInt();
		System.out.println(x);
		
		int y = r.nextInt(10); //0이상~10미만
		System.out.println(y);
		

	}

}
