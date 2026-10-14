import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Primeiro numero: ");
            double a = Double.parseDouble(sc.nextLine());
            System.out.print("Segundo numero: ");
            double b = Double.parseDouble(sc.nextLine());
            System.out.print("Operacao (+, -, *, /): ");
            String op = sc.nextLine();
            double resultado;
            switch (op) {
                case "+": resultado = a + b; break;
                case "-": resultado = a - b; break;
                case "*": resultado = a * b; break;
                case "/":
                    if (b == 0) {
                        throw new ArithmeticException("Divisao por zero");
                    }
                    resultado = a / b; break;
                default:
                    System.out.println("Operacao invalida.");
                    sc.close();
                    return;
            }
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Numero invalido.");
        } catch (ArithmeticException e) {
            System.out.println("Nao pode dividir por zero.");
        }
    }
}
