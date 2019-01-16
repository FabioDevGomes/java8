package pt.vom.uvanov.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import pt.com.ivanov.lambda.User;

public class TestPredicate {

	public static void main(String[] args) {
		
		User user1 = new User("Test 1", 150);
		User user2 = new User("Test 2", 50);
		User user3 = new User("Test 3", 120);
		User user4 = new User("Test 4", 30);
		
		//error here, asList return immutable list
//		List<User> users = Arrays.asList(user1, user2, user3);
		
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		Predicate<User> predicate = new Predicate<User>() {
			@Override
			public boolean test(User u) {
				return u.getPoints() > 100;
			}
		};

		//with lambda
		Predicate<User> predicate2 =  u -> u.getPoints() > 100;
		
		
//		users.removeIf(predicate2);
		
		//without declatation
		users.removeIf(u -> u.getPoints() > 125);

		users.forEach(u -> System.out.println(u.getName()));
		
	}
	
}
