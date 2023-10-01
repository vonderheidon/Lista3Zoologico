package br.com.fescfafic.zoologico.Model;

public abstract class Ambiente {
    public String nome;
    public int medidaAreaMetros;

    public Ambiente(String nome, int medidaAreaMetros){
        this.nome = nome;
        this.medidaAreaMetros = medidaAreaMetros;
    }
}
