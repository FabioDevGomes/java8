package pt.com.ivanov.methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
		
		
	}
}
