package pt.com.ivanov.lambda;

public class User {

	public User(String name) {
		this.name = name;
		this.moderator = false;
	}

	private String name;
	private boolean moderator;

	public boolean isModerator() {
		return moderator;
	}

	public void setModerator(boolean moderator) {
		this.moderator = moderator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
