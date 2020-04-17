package livro.cap7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import pt.com.ivanov.lambda.User;

public class StreansExample {

	public static void main(String[] args) {
		
		User user1 = new User("Test A", 150);
		User user2 = new User("Test C", 50);
		User user3 = new User("Test F", 120);
		User user4 = new User("Test B", 30);
		
		List<User> users = Arrays.asList(user1, user2, user3, user4);
		
		users.stream().filter(u -> u.getPoints() > 100).forEach(System.out::println);
		
		Stream<User> stream = users.stream().filter(u -> u.getPoints() > 40);
		stream.forEach(System.out::println); 
		
	}
}
