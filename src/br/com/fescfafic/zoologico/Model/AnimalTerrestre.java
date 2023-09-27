package br.com.fescfafic.zoologico.Model;

public abstract class AnimalTerrestre extends Animal{
    int qtdDePatas;

    public AnimalTerrestre(int qtdDePatas, String nome, String habitoAlimentar, String agrupamento, double peso, double altura) {
        super(nome, habitoAlimentar, agrupamento, peso, altura);
    }

    @Override
    public void locomover() {
        System.out.printf("%s esta andando.", this.nome);
    }
}
