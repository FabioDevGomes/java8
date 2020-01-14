package livro.cap8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import pt.com.ivanov.lambda.User;

public class PeakPipeline {

	public static void main(String[] args) {
		User user1 = new User("Test A", 150);
		User user2 = new User("Test C", 50);
		User user3 = new User("Test F", 120);
		User user4 = new User("Test B", 30);
		
		List<User> users = Arrays.asList(user4, user2, user3, user1);
		
		users.stream().filter(u -> u.getPoints() > 10).peek(System.out::println).findAny();
		users.stream().filter(u -> u.getPoints() > 10).peek(System.out::println).findFirst();
		
		System.out.println("===========");
		
		//sorte deveria ter um comportamento stateful mwamo com o findAny
		users.stream().sorted(Comparator.comparing(User::getName)).peek(System.out::println).findAny();
		
		System.out.println("===========");

		users.stream().sorted(Comparator.comparing(User::getPoints).reversed()).peek(System.out::println).findAny();
		
	}

}
