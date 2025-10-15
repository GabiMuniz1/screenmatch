import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Coraline");
        meuFilme.setAnoDelacamento(2009);
        meuFilme.setDuracaoEmMinutos(150);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        //estou chamando meus metodos da classe br.com.alura.screenmatch.modelos.Filme
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());

        //System.out.println(meuFilme.somaDasAvaliacoes);
        //System.out.println(meuFilme.totalDeAvaliacao);

        Serie serie = new Serie();
        serie.setNome("Welcome To Eltingville");
        serie.setAnoDelacamento(2002);
        serie.exibeFichaTecnica();
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporadas(15);
        serie.setMinutosPorEpisodio(25);

        System.out.println("Duração para maratonar Eltingville: " + serie.getDuracaoEmMinutos());


    }
}
