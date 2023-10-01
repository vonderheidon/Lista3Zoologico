package br.com.fescfafic.zoologico.Model;

public abstract class AnimalAquatico extends Animal {
    public boolean respiraEmbaixoDagua;

    public AnimalAquatico(boolean respiraEmbaixoDagua, String nome, String habitoAlimentar, String agrupamento, double peso, double altura) {
        super(nome, habitoAlimentar, agrupamento, peso, altura);
        this.respiraEmbaixoDagua = respiraEmbaixoDagua;
    }

    @Override
    public void exibirInfo() {
        String respira;
        super.exibirInfo();
        if (this.respiraEmbaixoDagua == true) {
            respira = "Sim";
        } else {
            respira = "Nao";
        }
        System.out.print("\nRespira embaixo dagua? " + respira);
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
