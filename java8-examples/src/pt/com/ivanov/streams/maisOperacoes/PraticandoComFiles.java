package pt.com.ivanov.streams.maisOperacoes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PraticandoComFiles {

	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".\\src\\pt\\com\\ivanov\\streams\\maisOperacoes")).forEach(System.out::println);
		
		System.out.println("---");
		
		Files.list(Paths.get(".\\src\\pt\\com\\ivanov\\streams\\maisOperacoes"))
		.filter(p -> p.toString().contains("Ma")).forEach(System.out::println);
	}

}
