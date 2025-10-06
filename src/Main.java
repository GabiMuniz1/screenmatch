public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Coraline");

        int anoDeLacamento = 2009;
        System.out.println("Ano de lançamento: " + anoDeLacamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 7.8;

        double media = (9.8 + 6.2 + 7.9) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Coraline
                Filme de terror infantil feito por stop motion
                Muito bom!
                ano de laçamento
                """ + anoDeLacamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}