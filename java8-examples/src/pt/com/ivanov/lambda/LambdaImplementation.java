package pt.com.ivanov.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaImplementation {
	
	public static void main(String[] args) {
		
		User user1 = new User("Ivanov");
		User user2 = new User("Fábio");
		User user3 = new User("Junim");
		
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		List<User> users2 = Arrays.asList(user1, user2, user3);
		
		showInForJava5(users);

		System.out.println("==============================");
		
		showUsingForeachMethod(users2);
		
		System.out.println("==============================");
		
		showUsingAnonymousImplementation(users2);
		
		System.out.println("==============================4");
		
		showUsingLambdaExpressions(users2);
		
		implementingTwiceWithAndThen(users2);
		
	}

	private static void implementingTwiceWithAndThen(List<User> users2) {
		Consumer<User> showMesssage = u -> System.out.println("First show the message");		
		Consumer<User> showNames = u -> System.out.println(u.getName());
		
		users2.forEach(showMesssage.andThen(showNames));
	}

	private static void showUsingLambdaExpressions(List<User> users2) {
		users2.forEach((User u) -> {System.out.println(u.getName());});
		System.out.println("-----");
		
		users2.forEach((User u) -> System.out.println(u.getName()));
		System.out.println("-----");
		
		users2.forEach( u -> System.out.println(u.getName()));
	}

	private static void showUsingAnonymousImplementation(List<User> users2) {
		users2.forEach(new Consumer<User>() {
			@Override
			public void accept(User t) {
				System.out.println(t.getName());
			}
		});
	}

	private static void showUsingForeachMethod(List<User> users2) {
		Showing showing = new Showing();
		users2.forEach(showing);
	}

	private static void showInForJava5(List<User> users) {
		for (User user : users) {
			System.out.println(user.getName());
		}
	}

}
