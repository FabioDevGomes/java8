package pt.com.ivanov.streams.maisOperacoes;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pt.com.ivanov.lambda.User;

public class MaisFlatMap {

	public static void main(String[] args) {
		User user1 = new User("user 1", 10);
		User user2 = new User("user 2", 20);
		User user3 = new User("user 3", 30);
		User user4 = new User("user 4", 40);
		User user5 = new User("user 5", 50);
		
		Grupo grupo1 = new Grupo();
		grupo1.add(user1);
		grupo1.add(user2);
		grupo1.add(user3);
		
		Grupo grupo2 = new Grupo();
		grupo2.add(user3);
		grupo2.add(user4);
		grupo2.add(user5);
		
		List<Grupo> grupos = Arrays.asList(grupo1, grupo2);
		
		//situação a ser evitada
		Stream<Stream<User>> grupoStream = grupos.stream().map(g -> g.getUsuarios().stream()).distinct();
		grupoStream.forEach(System.out::println);
		
		System.out.println("---");
		
		//situação desejada
		Set<User> gurpoStreamOK = grupos.stream().flatMap(g -> g.getUsuarios().stream()).collect(Collectors.toSet());	
		gurpoStreamOK.forEach(System.out::println);
		
		
		
		
	}

}
