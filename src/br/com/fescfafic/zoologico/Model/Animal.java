package br.com.fescfafic.zoologico.Model;

public abstract class Animal {
    String nome;
    String habitoAlimentar; //Carnivoros, Herbivoros, Onivoros
    String agrupamento; //Peixes, Anfibios, Repteis, Aves, Mamiferos
    double peso;
    double altura;

    public Animal(String nome, String habitoAlimentar, String agrupamento, double peso, double altura) {
        this.nome = nome;
        this.habitoAlimentar = habitoAlimentar;
        this.agrupamento = agrupamento;
        this.peso = peso;
        this.altura = altura;
    }

    public void exibirInfo() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Habito alimentar: " + this.habitoAlimentar);
        System.out.println("Classe animal: " + this.agrupamento);
        System.out.printf("Peso: %fKg\n", this.peso);
        System.out.printf("Altura: %fcm", this.altura);
    }
    public void locomover() {
        System.out.printf("\n%s esta se locomovendo.", this.nome);
    }
}
