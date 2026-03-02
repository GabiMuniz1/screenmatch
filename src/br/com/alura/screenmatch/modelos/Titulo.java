package br.com.alura.screenmatch.modelos;

public class Titulo {

    //Atributos da classe
    private String nome;
    private int anoDelacamento;
    private boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    //Meus métodos

    public int getTotalDeAvaliacao (){
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDelancamento(int anoDelacamento) {
        this.anoDelacamento = anoDelacamento;
    }

    public void setIncluindoNoPlano(boolean incluindoNoPlano) {
        this.incluindoNoPlano = incluindoNoPlano;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //Metodo: Exibe nome e data de lançamento
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano do lançamento: " + anoDelacamento);
    }

    //Metodo: Passa um argumento, ou seja, soma as notas avaliadas
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    // Metodo: Vai retornar o resultado da soma das avaliações / total de avaliações
    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
