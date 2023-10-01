package br.com.fescfafic.zoologico.Model;

public class AmbienteAereo extends Ambiente{
    public boolean possuiTrilhaAerea;
    public boolean possuiIluminacaoArtificial;
    public int alturaMaxMetros;
    public int qtdLagos;
    public int qtdArvores;
    public Animal[] listaAnimais;

    public AmbienteAereo(String nome, int medidaArea, boolean possuiTrilhaAerea, boolean possuiIluminacaoArtificial, int alturaMaxMetros, int qtdLagos, int qtdArvores, int qtdAnimais) {
        super(nome, medidaArea);
        this.possuiTrilhaAerea = possuiTrilhaAerea;
        this.possuiIluminacaoArtificial = possuiIluminacaoArtificial;
        this.alturaMaxMetros = alturaMaxMetros;
        this.qtdLagos = qtdLagos;
        this.qtdArvores = qtdArvores;
        this.listaAnimais = new Animal[qtdAnimais];
    }
    public void exibirInfo() {
        System.out.printf("\nNome do ambiente: %s\n", super.nome);
        System.out.printf("Possui trilha aera? %s\n", this.possuiTrilhaAerea ? "Sim" : "Nao");
        System.out.printf("Possui iluminacao artificial? %s\n", this.possuiIluminacaoArtificial ? "Sim" : "Nao");
        System.out.printf("Altura maxima: %dm\n", this.alturaMaxMetros);
        System.out.printf("Quantidade de lagos: %d\n", this.qtdLagos);
        System.out.printf("Quantidade de arvores: %d\n", this.qtdArvores);
        int qtdAnimais = contarAnimais();
        if (qtdAnimais > 0) {
            System.out.printf("Numero de animais residentes: %d\n", qtdAnimais);
            System.out.println("Sao eles:");
            this.listarAnimais();
        } else {
            System.out.print("Numero de animais residentes: Nenhum");
        }

    }
    public int contarAnimais() {
        int contador = 0;
        for (int i = 0; i < listaAnimais.length; i++) {
            if (listaAnimais[i] != null) {
                contador++;
            }
        }
        return contador;
    }
    public void listarAnimais() {
        for (int i = 0; i < listaAnimais.length; i++) {
            if (listaAnimais[i] != null) {
                System.out.printf(" - %s", listaAnimais[i].nome);
            }
        }
    }
    public void adicionarAnimal(AnimalAereo animalAereo) {
        for (int i = 0; i < listaAnimais.length; i++) {
            if (listaAnimais[i] == null) {
                listaAnimais[i] = animalAereo;
                return;
            }
        }
        System.out.print("\nNao foi possivel adicionar mais animais, capacidade maxima atingida.");
    }
}
