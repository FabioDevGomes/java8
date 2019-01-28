package pt.com.ivanov.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import pt.com.ivanov.lambda.User;

public class OptionalUtil {

	public static void main(String[] args) {
		
		User user1 = new User("user 1", 10);
		User user2 = new User("user 2", 20);
		User user3 = new User("user 3", 30);
		User user4 = new User("user 4", 40);
		User user5 = new User("user 5", 50);
		
		List<User> users = Arrays.asList(user1, user2, user3, user4, user5);
//		List<User> users = new ArrayList<User>();

		OptionalDouble average = users.stream().mapToInt(User::getPoints).average();
		
//		double average2 = users.stream().mapToInt(User::getPoints).average().getAsDouble();
//		System.out.println(average2);

		//if the list is empty the value of averagePoints will be 0.0
		double averagePoints = average.orElse(0.0);
		System.out.println(averagePoints);
		
//		double alternativeAveragePoints = users.stream().mapToInt(User::getPoints).average().orElse(0.0);
		
//		double alternativeAveragePoints = users.stream().mapToInt(User::getPoints).average().orElseThrow(IllegalStateException::new);
		
		users.stream().mapToInt(User::getPoints).average().ifPresent(value -> System.out.println(value));

		System.out.println("==========");
		
		users.stream().max(Comparator.comparingInt(User::getPoints)).ifPresent(u -> System.out.println(u.getPoints()));
		
//		 max.get();
		
		
	}

}
