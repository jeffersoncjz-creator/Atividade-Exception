import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);
        System.out.print("Data (dd/MM/yyyy): ");
        String texto = sc.nextLine();
        try {
            Date data = formato.parse(texto);
            if (!formato.format(data).equals(texto)) {
                throw new ParseException("Formato incorreto", 0);
            }
            System.out.println("Data valida: " + formato.format(data));
        } catch (ParseException e) {
            System.out.println("Data invalida.");
        }
    }
}