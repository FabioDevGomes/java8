package ivanov.udemy;

public class TestaValidador {

	public static void main(String[] args) {
		
		String valor = "33223-3344";
		Validador<String> telefone = v -> v.matches("[0-9]{5}-[0-9]{4}");
		System.out.println(telefone.validar(valor));
		
	}
}
