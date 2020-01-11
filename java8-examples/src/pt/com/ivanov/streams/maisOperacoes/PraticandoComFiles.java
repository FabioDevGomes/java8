package pt.com.ivanov.streams.maisOperacoes;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PraticandoComFiles {

	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".\\src\\pt\\com\\ivanov\\streams\\maisOperacoes")).forEach(System.out::println);
		
		System.out.println("---");
		
		Files.list(Paths.get(".\\src\\pt\\com\\ivanov\\streams\\maisOperacoes"))
		.filter(p -> p.toString().contains("Ma")).forEach(System.out::println);
		
		System.out.println("--- Leitura do arquivo");
		
		Path caminho = Paths.get(".\\src\\pt\\com\\ivanov\\streams\\maisOperacoes");
		Files.list(caminho).filter(p -> p.toString().contains("M")).map(p -> lines(p)).forEach(System.out::println);
		
	}
	
	static Stream<String> lines(Path path){
		try {
			return Files.lines(path);
		} catch (IOException e) {
			e.printStackTrace();
			throw new UncheckedIOException(e);
		}
	}

}
