import java.util.Scanner;
public class Questao14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Telefone (9 digitos): ");
        String telefone = sc.nextLine();
        try {
            if (telefone.length() != 9) {
                throw new CaracterInvalidoException("Deve ter 9 digitos");
            }
            for (int i = 0; i < telefone.length(); i++) {
                if (!Character.isDigit(telefone.charAt(i))) {
                    throw new CaracterInvalidoException("Somente digitos");
                }
            }
            System.out.println("Telefone valido.");
        } catch (CaracterInvalidoException e) {
            System.out.println("Telefone invalido: " + e.getMessage());
        }
    }
}
