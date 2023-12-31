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
        System.out.printf("\nEnvergadura da asa: %f cm", this.envergaduraDaAsa);
    }
    @Override
    public void locomover() {
        System.out.printf("\n%s esta voando.", this.nome);
    }
    @Override
    public void interagir() {
        System.out.printf("\n%s esta bicando a grade para chamar atencao.", this.nome);
    }
}
