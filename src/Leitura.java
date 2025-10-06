import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        //leitura de um valor em String
        String filme = leitura.nextLine();

        // leitura em um valor inteiro
        System.out.println("Qual o ano de lançamento?");
        int anoDeLacamento = leitura.nextInt();

        //leitura em um valor decimal
        System.out.println("Qual a nota para esse filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLacamento);
        System.out.println(avaliacao);

    }
}
