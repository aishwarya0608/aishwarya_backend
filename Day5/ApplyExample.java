package secondproject;

import java.util.function.Function;

public class ApplyExample {

	public static void main(String[] args) {
	
		 Function<Integer,Integer> b  = a->a/2;
		 
		 b=b.andThen(a->a*4);
		  System.out.println(b.apply(20));
		
	}

}
