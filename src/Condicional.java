public class Condicional {
    public static void main(String[] args) {
        int anoDeLacamento = 2009;
        System.out.println("Ano de lançamento: " + anoDeLacamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 7.8;
        String tipoPlano= "plus";

        if (anoDeLacamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filmes retrô que vale apena assistir");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado para assistir!");
        } else {
            System.out.println("Ops! você não tem acesso ao filme, alugue agora!");
        }
    }
}
