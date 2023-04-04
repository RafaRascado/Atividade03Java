
// Faça um programa que leia um número inteiro e mostre uma
// mensagem indicando se este número é par ou ímpar e se é
// positivo ou negativo.

  
import java.util.Scanner; 


class Main {
  public static void main(String[] args) {
    
    System.out.println("Digite o número A: ");
    Scanner teclado = new Scanner(System.in);
    int numeroA = teclado.nextInt();

    boolean verificandoNumeroPar = numeroA % 2 == 0;
    boolean verificandoNumeroPositivo = numeroA > 0;
    
    if(verificandoNumeroPar && verificandoNumeroPositivo){
      System.out.println("O número informado é par e positivo: " + numeroA);
    } else if(!verificandoNumeroPar && verificandoNumeroPositivo){
      System.out.println("O número informado é impar e positivo: " + numeroA);
    } else if(verificandoNumeroPar && !verificandoNumeroPositivo){
      System.out.println("O número informado é par e negativo: " + numeroA);
    } else if(!verificandoNumeroPar && !verificandoNumeroPositivo){
      System.out.println("O número informado é impar e negativo: " + numeroA);
    }
  }
}