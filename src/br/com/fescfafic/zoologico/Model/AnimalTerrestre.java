package br.com.fescfafic.zoologico.Model;

public abstract class AnimalTerrestre extends Animal {
    int qtdDePatas;

    public AnimalTerrestre(int qtdDePatas, String nome, String habitoAlimentar, String agrupamento, double peso, double altura) {
        super(nome, habitoAlimentar, agrupamento, peso, altura);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nQuantidade de patas %d", qtdDePatas);

    }
    @Override
    public void locomover() {
        System.out.printf("\n%s esta andando.", this.nome);
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
