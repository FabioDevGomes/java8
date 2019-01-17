package pt.com.ivanov.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import pt.com.ivanov.lambda.User;

public class TestComparator {

	public static void main(String[] args) {
		
		User user1 = new User("Test A", 150);
		User user2 = new User("Test C", 50);
		User user3 = new User("Test F", 120);
		User user4 = new User("Test B", 30);
		
		List<User> users = Arrays.asList(user1, user2, user3, user4);
		
		Comparator<User> comparator = new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		
//		Collections.sort(users, comparator);

		Collections.sort(users, (u1, u2)  -> u1.getName().compareTo(u2.getName()));
		
		users.forEach(u -> System.out.println(u.getName()));
		
	}
	
}
