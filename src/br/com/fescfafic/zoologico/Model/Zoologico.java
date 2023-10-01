package br.com.fescfafic.zoologico.Model;

import java.time.LocalTime;

public class Zoologico {
    public String nome;
    public String endereco;
    public LocalTime horarioAbertura;
    public LocalTime horarioFechamento;
    public double precoIngresso;
    public int qtdRestaurantes;
    public Ambiente[] listaAmbientes;

    public Zoologico(String nome, String endereco, LocalTime horarioAbertura,
                     LocalTime horarioFechamento, double precoIngresso,
                     int qtdRestaurantes, int qtdAmbientes) {
        this.nome = nome;
        this.endereco = endereco;
        this.horarioAbertura = horarioAbertura;
        this.horarioFechamento = horarioFechamento;
        this.precoIngresso = precoIngresso;
        this.qtdRestaurantes = qtdRestaurantes;
        this.listaAmbientes = new Ambiente[qtdAmbientes];
    }

    public void exibirInfo() {
        System.out.printf("\nNome do zoologico: %s\n", this.nome);
        System.out.printf("Endereco: %s\n", this.endereco);
        System.out.printf("Horario de abertura: %s\n", this.horarioAbertura.toString());
        System.out.printf("Horario de fechamento: %s\n", this.horarioFechamento.toString());
        System.out.printf("Preco do ingresso: R$ %.2f\n", this.precoIngresso);
        this.listarAmbientes();
    }
    public void adicionarAmbiente(Ambiente ambiente) {
        for (int i = 0; i < listaAmbientes.length; i++) {
            if (listaAmbientes[i] == null) {
                listaAmbientes[i] = ambiente;
                System.out.printf("\nAmbiente %s adicionado.", ambiente.nome);
                return;
            }
        }
        System.out.print("\nNao foi possivel adicionar um novo ambiente, limite maximo atingido.");
    }
    public void listarAmbientes() {
        boolean existe = false;
        System.out.print("Ambientes disponiveis: ");
        for (int i = 0; i < this.listaAmbientes.length; i++) {
            if (this.listaAmbientes[i] != null) {
                System.out.printf("\n - %s", this.listaAmbientes[i].nome);
                existe = true;
            }
        }
        if (existe == false) {
            System.out.print("nenhum ambiente esta liberado ainda.");
        }
    }
}
