package br.com.fescfafic.zoologico.Model;

public class AmbienteAquatico extends Ambiente {
    public boolean possuiAquecedores;
    public boolean possuiRespiradores;
    public int profundidadeMaxMetros;
    public int qtdAquarios;
    public int qtdFiltros;
    public Animal[] listaAnimaisAquaticos;
    public AmbienteAquatico(String nome, int medidaAreaMetros, boolean possuiAquecedores,
                            boolean possuiRespiradores, int profundidadeMaxMetros,
                            int qtdAquarios, int qtdFiltros, int qtdAnimais) {
        super(nome, medidaAreaMetros);
        this.possuiAquecedores = possuiAquecedores;
        this.possuiRespiradores = possuiRespiradores;
        this.profundidadeMaxMetros = profundidadeMaxMetros;
        this.qtdAquarios = qtdAquarios;
        this.qtdFiltros = qtdFiltros;
        this.listaAnimaisAquaticos = new Animal[qtdAnimais];
    }
    public void exibirInfo() {
        System.out.printf("\nNome do ambiente: %s\n", super.nome);
        System.out.printf("Possui aquecedores? %s\n", this.possuiAquecedores ? "Sim" : "Nao");
        System.out.printf("Possui respiradores? %s\n", this.possuiRespiradores ? "Sim" : "Nao");
        System.out.printf("Profundidade maxima: %dm\n", this.profundidadeMaxMetros);
        System.out.printf("Quantidade de aquarios: %d\n", this.qtdAquarios);
        System.out.printf("Quantidade de filtros: %d\n", this.qtdFiltros);
        this.listarAnimais();
    }
    public void adicionarAnimal(AnimalAquatico animalAquatico) {
        for (int i = 0; i < this.listaAnimaisAquaticos.length; i++) {
            if (this.listaAnimaisAquaticos[i] == null) {
                this.listaAnimaisAquaticos[i] = animalAquatico;
                return;
            }
        }
        System.out.print("\nNao foi possivel adicionar mais animais, capacidade maxima atingida.");
    }
    @Override
    public void listarAnimais() {
        boolean existe = false;
        System.out.print("Animais residentes: ");
        for (int i = 0; i < this.listaAnimaisAquaticos.length; i++) {
            if (this.listaAnimaisAquaticos[i] != null) {
                System.out.printf("\n - %s", this.listaAnimaisAquaticos[i].nome);
                existe = true;
            }
        }
        if (existe == false) {
            System.out.print("nenhum animal foi adicionado ainda.");
        }
    }
}
