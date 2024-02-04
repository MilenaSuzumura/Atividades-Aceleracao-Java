/* Exercícios
Execute a aplicação e verifique se o resultado no console mostrou a mensagem abaixo: A soma entre os dois números é: 45909
Crie um breakpoint na classe App, na primeira instrução dentro do método main, e acompanhe o fluxo de execução através do debugger, passo a passo, no mesmo nível, até o final da execução.
Com o mesmo breakpoint criado no exercício acima, execute a aplicação no modo debugger, e desta vez, entre com o fluxo de execução no método retornaSomaEntreDoisNumeros, percorra todas as instruções do método.
 */

import java.util.Arrays;
import java.util.List;

  public class App {
    public static void main(String[] args) {
      int soma = SomaNumeros.retornaSomaEntreDoisNumeros(38294, 7615);
      System.out.println("A soma entre os dois números é: " + soma);
    }
  }
