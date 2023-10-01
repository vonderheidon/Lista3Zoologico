package br.com.fescfafic.zoologico.Model;

public class AmbienteTerrestre extends Ambiente {
    public boolean possuiPiscinaNatural;
    public boolean possuiEscalador;
    public String tipoDeTerreno;
    public int qtdArbustos;
    public int qtdBebedouros;
    public Animal[] listaAnimaisTerrestres;
    public AmbienteTerrestre(String nome, int medidaAreaMetros, boolean possuiPiscinaNatural,
                             boolean possuiEscalador, String tipoDeTerreno, int qtdArbustos,
                             int qtdBebedouros, int qtdAnimais) {
        super(nome, medidaAreaMetros);
        this.possuiPiscinaNatural = possuiPiscinaNatural;
        this.possuiEscalador = possuiEscalador;
        this.tipoDeTerreno = tipoDeTerreno;
        this.qtdArbustos = qtdArbustos;
        this.qtdBebedouros = qtdBebedouros;
        this.listaAnimaisTerrestres = new Animal[qtdAnimais];
    }
    public void exibirInfo() {
        System.out.printf("\nNome do ambiente: %s\n", super.nome);
        System.out.printf("Possui piscina natural? %s\n", this.possuiPiscinaNatural ? "Sim" : "Nao");
        System.out.printf("Possui escalador? %s\n", this.possuiEscalador ? "Sim" : "Nao");
        System.out.printf("Tipo de terreno: %s\n", this.tipoDeTerreno);
        System.out.printf("Quantidade de arbustos: %d\n", this.qtdArbustos);
        System.out.printf("Quantidade de bebedouros: %d\n", this.qtdBebedouros);
        this.listarAnimais();
    }
    public void adicionarAnimal(AnimalTerrestre animalTerrestre) {
        for (int i = 0; i < this.listaAnimaisTerrestres.length; i++) {
            if (this.listaAnimaisTerrestres[i] == null) {
                this.listaAnimaisTerrestres[i] = animalTerrestre;
                return;
            }
        }
        System.out.print("\nNao foi possivel adicionar mais animais, capacidade maxima atingida.");
    }
    @Override
    public void listarAnimais() {
        boolean existe = false;
        System.out.print("Animais residentes: ");
        for (int i = 0; i < this.listaAnimaisTerrestres.length; i++) {
            if (this.listaAnimaisTerrestres[i] != null) {
                System.out.printf("\n - %s", this.listaAnimaisTerrestres[i].nome);
                existe = true;
            }
        }
        if (existe == false) {
            System.out.print("nenhum animal foi adicionado ainda.");
        }
    }
}
