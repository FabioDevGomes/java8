package pt.com.ivanov.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import pt.com.ivanov.lambda.User;

public class MainStreamFilter {

	public static void main(String[] args) {
		
		User user1 = new User("user 1", 10);
		User user2 = new User("user 2", 20);
		User user3 = new User("user 3", 30);
		User user4 = new User("user 4", 40);
		User user5 = new User("user 5", 50);
		
		List<User> users = Arrays.asList(user1, user2, user3, user4, user5);
		
		
		Stream<User> stream = users.stream().filter(u -> u.getPoints() > 20);
		
		stream.forEach(u -> System.out.println(u.getPoints()));
		
		users.stream().filter(u -> u.getPoints() > 30).forEach(u -> System.out.println(u.getName() +" - "+ u.getPoints()));
		
		users.forEach(u -> System.out.println(u.isModerator()));
		
		users.stream().filter(u -> u.getPoints() > 35).forEach(u -> u.tornarModerador());
		
		System.out.println("===============");
		
		users.stream().forEach(u -> System.out.println(u.isModerator()));
		
		List<User> users2 = new ArrayList<User>();
		
		users.stream().filter(u -> u.getPoints() > 35).forEach(u -> users2.add(u));
		
		System.out.println("==============");
		
		users2.forEach(System.out::println);
		
		
	}
	
}
