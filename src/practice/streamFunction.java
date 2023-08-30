package practice;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class streamFunction {

	public static void main(String[] args) {
		OptionalDouble optionalDouble = IntStream.rangeClosed(1,100).
		 filter(i -> i %2 != 0).
		 average();
		
		if(optionalDouble.isPresent())
			System.out.println("Avg =" + optionalDouble.getAsDouble());
		else
			System.out.println("no avg bitches");
	

	}

}
