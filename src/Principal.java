import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Coraline");
        meuFilme.setAnoDelancamento(2009);
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

        Serie eltingville = new Serie();
        eltingville.setNome("Eltingville Club");
        eltingville.setAnoDelancamento(2002);
        eltingville.exibeFichaTecnica();
        eltingville.setTemporadas(5);
        eltingville.setEpisodiosPorTemporadas(15);
        eltingville.setMinutosPorEpisodio(25);
        System.out.println("Duração para maratonar Eltingville Club: " + eltingville.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Toc Toc");
        outroFilme.setAnoDelancamento(2021);
        outroFilme.setDuracaoEmMinutos(200);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(eltingville);
        System.out.println(calculadora.getTempoTotal());

        Episodio episodio = new Episodio ();
        episodio.setNumero(1);
        episodio.setSerie(eltingville);
        episodio.setTotalvisualizacoes(300);
        filtro.filtra(episodio);
    }
}
