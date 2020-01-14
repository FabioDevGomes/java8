package livro.cap7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import pt.com.ivanov.lambda.User;

public class AvancoAPICollections {

	public static void main(String[] args) {
		
		User user1 = new User("Test A", 150);
		User user2 = new User("Test C", 50);
		User user3 = new User("Test F", 120);
		User user4 = new User("Test B", 30);
		
		List<User> users = Arrays.asList(user1, user2, user3, user4);
		
		System.out.println(users);
		
		//ordenando de forma simples
		users.sort(Comparator.comparing(User::getPoints));
		
		//ordem reversa
		users.sort(Comparator.comparing(User::getPoints).reversed());
		
		System.out.println(users);
		
	}
	
}
