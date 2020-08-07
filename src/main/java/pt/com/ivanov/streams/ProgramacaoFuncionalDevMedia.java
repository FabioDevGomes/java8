package main.java.pt.com.ivanov.streams;

import java.util.Arrays;
import java.util.List;

public class ProgramacaoFuncionalDevMedia {

  public static void main(String[] args) {
    List<String> lista = Arrays.asList("1", "2", "5");

    //exemplo de programação funcional permitida a partir do java 8
    final int soma = lista.stream().map(item -> Integer.parseInt(item)).reduce(0, (a, b) -> a + b);

    System.out.println("soma = "+ soma);
  }

}
