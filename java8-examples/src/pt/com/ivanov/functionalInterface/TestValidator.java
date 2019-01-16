package pt.com.ivanov.functionalInterface;

public class TestValidator {

	public static void main(String[] args) {

		Validator<String> validatorCEP = new Validator<String>() {
			@Override
			public boolean validate(String value) {
				return value.matches("[0-9]{5}-[0-9]{3}");
			}
		};

		boolean testResult = validatorCEP.validate("04101-100");

		System.out.println(testResult);

		System.out.println("=======================================");
		
		Validator<String> validatorCEPLambda = value -> value.matches("[0-9]{5}-[0-9]{3}");

		Validator<String> validatorCEPLambda2 = value -> { return value.matches("[0-9]{5}-[0-9]{3}");};
	}

}
