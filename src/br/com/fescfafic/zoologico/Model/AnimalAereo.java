package br.com.fescfafic.zoologico.Model;

public abstract class AnimalAereo extends Animal{
    double envergaduraDaAsa;

    public AnimalAereo(double envergaduraDaAsa, String nome, String habitoAlimentar, String agrupamento, double peso, double altura) {
        super(nome, habitoAlimentar, agrupamento, peso, altura);
    }

    @Override
    public void locomover() {
        System.out.printf("%s esta voando.", this.nome);
    }
}