package secondproject;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		
		
		Consumer<String> consumer= a -> System.out.println(a);
		consumer.accept("Aishu");

}
}