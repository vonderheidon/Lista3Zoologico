package br.com.fescfafic.zoologico.Model;

public abstract class AnimalAereo extends Animal {
    public double envergaduraDaAsa;

    public AnimalAereo(double envergaduraDaAsa, String nome, String habitoAlimentar, String agrupamento, double pesoKg, int comprimentoCm) {
        super(nome, habitoAlimentar, agrupamento, pesoKg, comprimentoCm);
        this.envergaduraDaAsa = envergaduraDaAsa;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("Envergadura da asa: %f cm", this.envergaduraDaAsa);
    }
    @Override
    public void locomover() {
        System.out.printf("%s esta voando.", this.nome);
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
