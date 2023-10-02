package br.com.fescfafic.zoologico.Model;

public abstract class AnimalAquatico extends Animal {
    public boolean respiraEmbaixoDagua;

    public AnimalAquatico(boolean respiraEmbaixoDagua, String nome, String habitoAlimentar, String agrupamento, double pesoKg, int comprimentoCm) {
        super(nome, habitoAlimentar, agrupamento, pesoKg, comprimentoCm);
        this.respiraEmbaixoDagua = respiraEmbaixoDagua;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.print("\nRespira embaixo dagua? " + (this.respiraEmbaixoDagua ? "Sim" : "Nao"));
    }
    @Override
    public void locomover() {
        System.out.printf("%s esta nadando.", this.nome);
    }
    @Override
    public void comer() {
        super.comer();
    }
    @Override
    public void interagir() {
        super.interagir();
    }
}
