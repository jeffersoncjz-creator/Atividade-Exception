
public class Questao5 {

    public static void main(String[] args) {

        String[] nomes = {"Ana", "Carlos", null, "Maria"};

        for (int i = 0; i < nomes.length; i++) {
            try {
                System.out.println(nomes[i].toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("Erro: elemento nulo!");
            }
        }
    }
}
