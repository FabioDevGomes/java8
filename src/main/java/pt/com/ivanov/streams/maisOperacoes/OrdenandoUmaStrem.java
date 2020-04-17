package pt.com.ivanov.streams.maisOperacoes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import pt.com.ivanov.lambda.User;

public class OrdenandoUmaStrem {

	public static void main(String[] args) {
		User user1 = new User("user 1", 10);
		User user2 = new User("user 2", 20);
		User user3 = new User("user 3", 30);
		User user4 = new User("user 4", 40);
		User user5 = new User("user 5", 50);
		
		List<User> users = Arrays.asList(user1, user2, user3, user4, user5);
		
//		List<User> usuariosFiltrados = users.stream()
//				.filter(u -> u.getPoints()> 20).sorted(Comparator.comparing(User::getPoints)).peek(System.out::println)
//				.collect(Collectors.toList());
		
		users.stream()
		//.filter(u -> u.getPoints() > 40)
		.sorted(Comparator.comparing(User::getPoints)).peek(System.out::println)
		.findAny();
		
//		usuariosFiltrados.forEach(System.out::println);
		
		//findAny return a Optional<>
		boolean checkResul = users.stream().filter(u -> u.getPoints() > 30).map(User::getName).findAny().isPresent();
		System.out.println(checkResul);
		
		users.stream().filter(u -> u.getPoints() > 30).map(User::getName).findAny();
		
	}
}
