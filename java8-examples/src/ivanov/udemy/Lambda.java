package ivanov.udemy;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(2,4,7,5,99,44);
		numeros.forEach(num -> System.out.println(num));

		System.out.println();
		
		numeros.forEach(num -> {
			num = num + 10;
			System.out.println(num);
		});

		System.out.println();
		
		int incremento = 100; //não permite alterar o valor dentro da expressão lambda	
		numeros.forEach(num -> {
			num = num + incremento;
			System.out.println(num);
		});

		System.out.println();
		
		numeros.forEach(num -> {
			int novoValor = num / 2;
			System.out.println(novoValor);
		});
	}

}
