package main.java.ivanov.udemy;

interface Teste{
  void imprime();
}

class Teste2{
  public static void imprimeDaClasse(){
    System.out.println("imprime da classe");
  }
}

public class MetodReference {

  public static void main(String[] args) {

    Teste interfac = Teste2::imprimeDaClasse;


    interfac.imprime();
  }

}
