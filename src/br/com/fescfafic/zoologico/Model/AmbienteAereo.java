package br.com.fescfafic.zoologico.Model;

public class AmbienteAereo extends Ambiente{
    public boolean possuiTrilhaAerea;
    public boolean possuiIluminacaoArtificial;
    public int alturaMaxMetros;
    public int qtdLagos;
    public int qtdArvores;
    public Animal[] listaAnimaisAereos;

    public AmbienteAereo(String nome, int medidaArea, boolean possuiTrilhaAerea,
                         boolean possuiIluminacaoArtificial, int alturaMaxMetros,
                         int qtdLagos, int qtdArvores, int qtdAnimais) {
        super(nome, medidaArea);
        this.possuiTrilhaAerea = possuiTrilhaAerea;
        this.possuiIluminacaoArtificial = possuiIluminacaoArtificial;
        this.alturaMaxMetros = alturaMaxMetros;
        this.qtdLagos = qtdLagos;
        this.qtdArvores = qtdArvores;
        this.listaAnimaisAereos = new Animal[qtdAnimais];
    }
    public void exibirInfo() {
        System.out.printf("\nNome do ambiente: %s\n", super.nome);
        System.out.printf("Possui trilha aera? %s\n", this.possuiTrilhaAerea ? "Sim" : "Nao");
        System.out.printf("Possui iluminacao artificial? %s\n", this.possuiIluminacaoArtificial ? "Sim" : "Nao");
        System.out.printf("Altura maxima: %dm\n", this.alturaMaxMetros);
        System.out.printf("Quantidade de lagos: %d\n", this.qtdLagos);
        System.out.printf("Quantidade de arvores: %d\n", this.qtdArvores);
        this.listarAnimais();
    }
    public void adicionarAnimal(AnimalAereo animalAereo) {
        for (int i = 0; i < this.listaAnimaisAereos.length; i++) {
            if (this.listaAnimaisAereos[i] == null) {
                this.listaAnimaisAereos[i] = animalAereo;
                return;
            }
        }
        System.out.print("\nNao foi possivel adicionar mais animais, capacidade maxima atingida.");
    }
    @Override
    public void listarAnimais() {
        boolean existe = false;
        System.out.print("Animais residentes: ");
        for (int i = 0; i < this.listaAnimaisAereos.length; i++) {
            if (this.listaAnimaisAereos[i] != null) {
                System.out.printf("\n - %s", this.listaAnimaisAereos[i].nome);
                existe = true;
            }
        }
        if (existe == false) {
            System.out.print("nenhum animal foi adicionado ainda.");
        }
    }
}
