package pt.com.ivanov.streams.maisOperacoes;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import pt.com.ivanov.lambda.User;

public class Grupo {
	private Set<User> usuarios = new HashSet<>();
	
	public void add(User user) {
		this.usuarios.add(user);
	}
	
	public Set<User> getUsuarios(){
		return Collections.unmodifiableSet(usuarios);
	}

}
