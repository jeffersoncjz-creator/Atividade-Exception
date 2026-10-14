import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {

        private double saldo;

        static void main() {

            int[] numeros = {50, 20, 40};

            int num1 = 10;
            int num2 = 0;

            System.out.println("Calculo realizado...");

            double n1 = 8, n2 = 6;
            double media = (n1 + n2 / 2);

            Scanner sc = new Scanner(System.in);

            while (true) {
                try {
                    System.out.println("Digite o dividendo: ");
                    int dividendo = sc.nextInt();
                    System.out.println("Digite o divisor: ");
                    int divisor = sc.nextInt();
                    System.out.println(calcular(dividendo, divisor));
                } catch (NaoPodeDividirPorZeroException e) {
                    System.out.println("Caiu na execeção de dividir por zero");
                } catch (InputMismatchException e) {
                    System.out.println("Caiu na execeção de dados invalidos");
                    sc.nextLine();
                } finally {
                    System.out.println("Sempre será executado!");
                }
            }

        }

        static double calcular(int n1, int n2) {
            try {
                return n1/n2;
            } catch (Exception ex) {
                throw new NaoPodeDividirPorZeroException("Não pode dividir por zero");
            }
        }
}
