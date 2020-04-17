package ivanov.udemy;

public class Calculadora {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Math somar = (a, b) -> a + b;
		Math subtrair = (a, b) -> a - b;
		
		System.out.println(calculadora.excOperacao(2, 5, somar));
		System.out.println(calculadora.excOperacao(2, 5, subtrair));
	}
	
	public int excOperacao(int a, int b, Math op) {
		return op.operacao(a, b);
	}
	
}
