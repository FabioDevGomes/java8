package pt.com.ivanov.streams.maisOperacoes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pt.com.ivanov.lambda.User;

public class MaisMetodos {

	public static void main(String[] args) {

		User user1 = new User("user 1", 10);
		User user2 = new User("user 2", 20);
		User user3 = new User("user 3", 30);
		User user4 = new User("user 4", 40);
		User user5 = new User("user 5", 50);
		
		List<User> users = Arrays.asList(user1, user2, user3, user4, user5);
		
		System.out.println(users.stream().count());
		
		users.stream().skip(2).forEach(u -> System.out.println(u.getName()));
		
		System.out.println("----");
		
		users.stream().limit(2).forEach(u -> System.out.println(u.getName()));

		System.out.println("----");
		
		getIntervaloValores(1,	3, users.stream()).forEach(u -> System.out.println(u.getName()));
	}
	
	private static List<User> getIntervaloValores(int inicio, int fim, Stream<User> strream){
		return strream.skip(inicio).limit(fim).collect(Collectors.toList());
	}

}
