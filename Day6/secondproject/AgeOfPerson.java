package secondproject;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeOfPerson {

	public static void main(String[] args) {
		
			LocalDate birthday = LocalDate.of(1998, 8, 6);
			LocalDate today = LocalDate.now();
			System.out.println(ChronoUnit.YEARS.between(birthday, today));
	}

}
