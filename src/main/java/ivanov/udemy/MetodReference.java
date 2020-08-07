package main.java.ivanov.udemy;

import java.util.Arrays;
import java.util.List;

interface Teste{
  void imprime();
}

class Teste2{
  public static void imprimeDaClasse(){
    System.out.println("imprime da classe");
  }

  public static void imprimeDaClasseComParametro(String texto){
    System.out.println("imprime da classe - "+ texto);
  }
}

public class MetodReference {

  public static void main(String[] args) {
    Teste interfac = Teste2::imprimeDaClasse;
    interfac.imprime();

    List<String> lista = Arrays.asList("valor 1", "valor 2");
//    lista.forEach(System.out::println);
    lista.forEach(Teste2::imprimeDaClasseComParametro);
  }

}
