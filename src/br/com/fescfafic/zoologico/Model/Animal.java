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
        System.out.println("Nome: " + this.nome);
        System.out.println("Habito alimentar: " + this.habitoAlimentar);
        System.out.println("Classe animal: " + this.agrupamento);
        System.out.printf("Peso: %.2fKg", this.peso);
        System.out.printf("\nAltura: %.2fcm", this.altura);
    }
    public void locomover() {
        System.out.printf("%s esta se locomovendo.", this.nome);
    }
    public void comer() {
        System.out.printf("%s esta comendo.", this.nome);
    }
    public void interagir() {
        System.out.printf("%s esta interagindo.", this.nome);
    }
}
