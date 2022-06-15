import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) throws Exception {

        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Escreva a palvra: ");
            String entrada = input.nextLine();
            char[] caracter = entrada.toCharArray();
            int comecar = 0;
            int encerrar = caracter.length-1;
            char mod;

            while(encerrar > comecar){
                mod = caracter[comecar];
                caracter[comecar] = caracter[encerrar];
                caracter[encerrar] = mod;
                encerrar--;
                comecar++;
            }
            entrada = new String(caracter);
            System.out.println(entrada);

        } catch(Exception e){
            throw new Exception("É preciso uma entrada válida!");
        }
    }
}
