package secondproject;

import java.util.Random;
import java.util.function.Supplier;

public class SuplierExample {
	
	
	public static void main(String[] args) {
		
		
		Supplier<String> supplier = ()-> "Sohan";
		System.out.println(supplier.get());
	}

}
