import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        try {
            System.out.print("Linha: ");
            int linha = Integer.parseInt(sc.nextLine());
            System.out.print("Coluna: ");
            int coluna = Integer.parseInt(sc.nextLine());
            System.out.println("Valor: " + matriz[linha][coluna]);
        } catch (NumberFormatException e) {
            System.out.println("Digite indices inteiros.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Linha ou coluna inexistente.");
        }
    }
}
