package br.com.fescfafic.zoologico.Model;

public abstract class Animal {
    String nome;
    String tipoDeAlimentacao; //Carnivoros, Herbiveros, Onivoros
    String agrupamento; //Peixes, Anfibios, Repteis, Aves, Mamiferos
    double peso;
    double altura;

    public Animal(String nome, String tipoDeAlimentacao, String agrupmento, double peso, double altura) {
        this.nome = nome;
        this.tipoDeAlimentacao = tipoDeAlimentacao;
        this.agrupamento = agrupmento;
        this.peso = peso;
        this.altura = altura;
    }
}
