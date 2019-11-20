package ivanov.udemy;

import java.util.function.Predicate;

public class InterfacesFuncionais {

	public static void main(String[] args) {
		Predicate<String> predicate = s -> s.length() > 2;
		System.out.println(predicate.test("fab"));
		System.out.println(predicate.negate().test("fab"));
	}

}
