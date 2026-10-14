import java.util.Scanner;

public class Questao3 {

   public static void mostrar(int[] numeros, int indice) {
        try {
            System.out.println("Valor: " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice invalido.");
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40};
        try {
            System.out.print("Indice de 0 a 3: ");
            int indice = Integer.parseInt(sc.nextLine());
            mostrar(numeros, indice);
        } catch (NumberFormatException e) {
            System.out.println("O indice precisa ser inteiro.");
        }
    }
}