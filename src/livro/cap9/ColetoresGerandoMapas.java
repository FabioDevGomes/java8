package livro.cap9;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ColetoresGerandoMapas {
	
	public static void main(String[] args) {
		Path caminho = Paths.get(".\\src\\pt\\com\\ivanov\\streams\\maisOperacoes");

		try {
			Files.list(caminho).filter(p -> p.toString().contains("Stream"))
					.flatMap(p -> lines(p)).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----");
		
		try {
			LongStream longStream = Files.list(caminho).filter(p -> p.toString().contains("Stream"))
			.mapToLong(p -> lines(p).count());
			
			longStream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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
