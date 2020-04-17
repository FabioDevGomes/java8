package livro.cap8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import pt.com.ivanov.lambda.User;

public class FilterSortedCollect {

	public static void main(String[] args) {
		User user1 = new User("Test A", 150);
		User user2 = new User("Test C", 50);
		User user3 = new User("Test F", 120);
		User user4 = new User("Test B", 30);
		
		List<User> users = Arrays.asList(user1, user2, user3, user4);
		
//		users.stream().filter(u -> u.getPoints() > 45).sorted(Comparator.comparing(User::getName)).map(User::getName).forEach(System.out::println);
		
		List<User> usuarios = users.stream().filter(u -> u.getPoints() > 45).sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
		usuarios.forEach(System.out::println);
		
		
	}

}
