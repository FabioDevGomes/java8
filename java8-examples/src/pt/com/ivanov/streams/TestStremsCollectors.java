package pt.com.ivanov.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

import pt.com.ivanov.lambda.User;

public class TestStremsCollectors {

	public static void main(String[] args) {
		
		BiFunction<String, Integer, User> userFactory = User::new;
		
		User user1 = userFactory.apply("user 1", 10);
		User user2 = userFactory.apply("user 2", 20);
		User user3 = userFactory.apply("user 3", 30);
		User user4 = userFactory.apply("user 4", 40);
		User user5 = userFactory.apply("user 5", 50);
		User user6 = userFactory.apply("user 6", 60);
		User user7 = userFactory.apply("user 7", 70);
		User user8 = userFactory.apply("user 8", 80);
		
		List<User> users = Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8);
		
		users.sort(Comparator.comparing(User::getPoints).reversed());
		
//		users.subList(0, 5).forEach(u -> System.out.println(u.getName() +" - "+u.getPoints()));

//		users.subList(0, 3).forEach(u -> {u.tornarModerador(); System.out.println(u.getName() +" - "+u.getPoints() +" - "+u.isModerator());});
		users.subList(0, 3).forEach(User::tornarModerador);
		
		System.out.println("===============");

		users.forEach(u -> System.out.println(u.getName() +" - "+u.getPoints() +" - "+u.isModerator()));
	}
}
