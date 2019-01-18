package pt.com.ivanov.methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import pt.com.ivanov.lambda.User;

public class TestMethodReference {

	public static void main(String[] args) {
		
		User user1 = new User("Test A", 150);
		User user2 = new User("Test C", 50);
		User user3 = new User("Test F", 120);
		User user4 = new User("Test B", 120);
		
		List<User> users = Arrays.asList(user1, user2, user3, user4);
		
		users.forEach(User :: tornarModerador);
		
		users.sort(Comparator.comparingInt(User::getPoints).thenComparing(User::getName).reversed());
		
		users.forEach(u -> System.out.println(u.getName() +" - "+ u.getPoints()));
		
		System.out.println("===============");
		
		usingNewKeyWord();
	}
	
	public static void usingNewKeyWord() {
		Supplier<User> userFactory = User::new;
		User user = userFactory.get();
		
		System.out.println(user);
		
		Function<String, User> userFactory2 = User::new;
		User user2 = userFactory2.apply("Test constructor");
		
		System.out.println(user2.getName());
		
		BiFunction<String, Integer, User> userFactory3 = User::new;
		User user3 = userFactory3.apply("New test", 20);
		
		System.out.println(user3.getName() +" - "+ user3.getPoints());
	}
}
