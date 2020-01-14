package pt.com.ivanov.functionalInterface;


@FunctionalInterface
public interface Validator<T> {
	boolean validate(String value);
	
	default void showText() {
		System.out.println("example default method with annotation @FunctionalInterface");
	}
}
