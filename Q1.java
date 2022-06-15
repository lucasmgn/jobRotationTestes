import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) throws Exception {
        /*
        * 1º questão
        * int INDICE = 13, SOMA = 0, K = 0;
        * enquanto K < INDICE faça
        *  {
        * K = K + 1;
        * SOMA = SOMA + K;
        *  }
        * imprimir(SOMA);
        *  Ao final do processamento, qual será o valor da variável SOMA?
         * */
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um numero: ");

            int indice = 13;
            int soma = 0;
            int k;

            k = input.nextInt();

            while (k < indice){
                k = k + 1;
                soma = soma + k;
            }
            System.out.println("A soma é " + soma);

        }catch(Exception e){
            throw new Exception("É preciso uma entrada válida!");
        }






















    }
}
