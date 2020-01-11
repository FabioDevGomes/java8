package pt.com.ivanov.streams.maisOperacoes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import pt.com.ivanov.lambda.User;

public class MaisOperacoesComStreams {

	public static void main(String[] args) {

		User user1 = new User("user 1", 10);
		User user2 = new User("user 2", 20);
		User user3 = new User("user 3", 30);
		User user4 = new User("user 4", 40);
		User user5 = new User("user 5", 50);
		
		List<User> users = Arrays.asList(user1, user2, user3, user4, user5);
		
		Optional<String> usuarioFiltradoMax = users.stream().max(Comparator.comparing(User::getPoints)).map(User::getName);
		
		System.out.println(usuarioFiltradoMax);
		System.out.println(usuarioFiltradoMax.isPresent());
		
		
		System.out.println(users.stream().allMatch(User::isModerator));
		System.out.println(users.stream().anyMatch(User::isModerator));
		
		System.out.println("--------");
		
		//o supplier mantem o estado
		IntStream.generate(new Fibonacci()).limit(10).forEach(System.out::println);
		
	}

}
