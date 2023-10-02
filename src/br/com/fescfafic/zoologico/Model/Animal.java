package br.com.fescfafic.zoologico.Model;

public abstract class Animal {
    public String nome;
    public String habitoAlimentar; //Carnivoros, Herbivoros, Onivoros
    public String agrupamento; //Peixes, Anfibios, Repteis, Aves, Mamiferos
    public double pesoKg;
    public int comprimentoCm;

    public Animal(String nome, String habitoAlimentar, String agrupamento, double pesoKg, int comprimentoCm) {
        this.nome = nome;
        this.habitoAlimentar = habitoAlimentar;
        this.agrupamento = agrupamento;
        this.pesoKg = pesoKg;
        this.comprimentoCm = comprimentoCm;
    }

    public void exibirInfo() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Habito alimentar: " + this.habitoAlimentar);
        System.out.println("Classe animal: " + this.agrupamento);
        System.out.printf("Peso: %.2f Kg", this.pesoKg);
        System.out.printf("\nComprimento: %d cm", this.comprimentoCm);
    }
    public void locomover() {
        System.out.printf("\n%s esta se locomovendo.", this.nome);
    }
    public void comer() {
        if (this.habitoAlimentar.equalsIgnoreCase("Onivoro")) {
            System.out.printf("\n%s esta comendo vegetais ou carne, tant faz.", this.nome);
        } else if (this.habitoAlimentar.equalsIgnoreCase("Carnivoro")) {
            System.out.printf("\n%s esta comendo outros bichos.", this.nome);
        } else if (this.habitoAlimentar.equalsIgnoreCase("Herbivoro")) {
            System.out.printf("\n%s esta comendo vegetais.", this.nome);
        } else {
            System.out.printf("\n%s esta comendo.", this.nome);
        }
    }
    public void interagir() {
        System.out.printf("\n%s esta interagindo.", this.nome);
    }
}
