package br.com.fescfafic.zoologico.Model;

public abstract class AnimalAquatico extends Animal {
    boolean respiraEmbaixoDagua;

    public AnimalAquatico(boolean respiraEmbaixoDagua, String nome, String habitoAlimentar, String agrupamento, double peso, double altura) {
        super(nome, habitoAlimentar, agrupamento, peso, altura);
    }

    @Override
    public void locomover() {
        System.out.printf("%s esta nadando.", this.nome);
    }
}
