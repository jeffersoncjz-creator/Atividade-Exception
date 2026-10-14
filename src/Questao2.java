import java.util.Scanner;

public class Questao2 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        String texto = sc.nextLine();
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Numero: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Nao foi possivel converter.");
        }
    }
}
