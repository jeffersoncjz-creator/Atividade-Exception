import java.util.Scanner;


public class Questao12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("CPF (11 digitos, sem pontuacao): ");
        String cpf = sc.nextLine();

        try {
            if (cpf.length() != 11) {
                throw new CaracterInvalidoException("Tamanho incorreto");
            }

            for (int i = 0; i < cpf.length(); i++) {
                if (!Character.isDigit(cpf.charAt(i))) {
                    throw new CaracterInvalidoException("Caracter nao numerico");
                }
            }

            System.out.println("Formato de CPF valido.");

        } catch (CaracterInvalidoException e) {
            System.out.println("CPF invalido: " + e.getMessage());
        }

        sc.close();
    }
}
