package pt.com.ivanov.lambda;

public class User {

	public User() {
	}
	
	public User(String name) {
		this.name = name;
		this.moderator = false;
	}
	
	public User(String name, int points) {
		this.name = name;
		this.points = points;
	}

	private String name;
	private boolean moderator;
	private int points;

	public boolean isModerator() {
		return moderator;
	}

	public void tornarModerador() {
		this.moderator = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", moderator=" + moderator + ", points=" + points + "]";
	}
	
	

}
