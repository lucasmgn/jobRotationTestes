import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws Exception {
        /* 2º questão
         * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
         * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21,
         * 34...), escreva um programa na linguagem que desejar onde, informado um
         * número, ele calcule a sequência de Fibonacci e retorne uma mensagem
         * avisando se o número informado pertence ou não a sequência.
         **/
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um numero: ");

            int numeroVerificar = input.nextInt();
            boolean pertence = false;
            for (int i = 0; i <= numeroVerificar; i++) {
                int fibNumero = funcFib(i);
                if(numeroVerificar == fibNumero){
                    pertence = true;
                    break;
                }
            }
            if(pertence == true){
                System.out.println("Pertence");
            }else{
                System.out.println("Não pertece");
            }

        }catch(Exception e){
            throw new Exception("É preciso uma entrada válida!");
        }

    }

    public static int funcFib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return funcFib(n - 1) + funcFib(n - 2);
    }

}
