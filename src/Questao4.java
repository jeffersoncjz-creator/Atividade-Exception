import java.util.Scanner;

public class Questao4 {

        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um texto (ou null): ");
            String texto = sc.nextLine();
            if (texto.equals("null")) {
                texto = null;
            }
            try {
                System.out.println("Tamanho: " + texto.length());
            } catch (NullPointerException e) {
                System.out.println("A string esta nula.");
            }
        }
}
