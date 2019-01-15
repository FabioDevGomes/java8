package pt.com.ivanov.lambda;

import java.util.function.Consumer;

public class Showing implements Consumer<User>{

	@Override
	public void accept(User t) {
		System.out.println(t.getName());
	}

}
