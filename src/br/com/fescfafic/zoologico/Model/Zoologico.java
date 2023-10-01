package br.com.fescfafic.zoologico.Model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Zoologico {
    public String nome;
    public String endereco;
    public LocalTime horarioAbertura;
    public LocalTime horarioFechamento;
    public double precoIngresso;
    public int qtdRestaurantes;
    public Ambiente[] listaAmbientes;
    public int qtdVisitantes;

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
        this.qtdVisitantes = 0;
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
    public void verificarFuncionamento() {
        System.out.print("\nAgora sao " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        if (LocalTime.now().isAfter(horarioAbertura) && LocalTime.now().isBefore(horarioFechamento)) {
            System.out.print(" e o zoologico esta funcionando.");
        } else {
            System.out.print(" e o zoologico esta fechado.");
        }
    }
    public void registrarVisitante(String nome) {
        this.qtdVisitantes++;
        System.out.printf("\nVisitante %s foi registrado.", nome);
    }
    public void calcularReceita() {
        double receita = qtdVisitantes * precoIngresso;
        if (receita > 0) {
            System.out.printf("\nO total de receita gerada sem descontos eh de R$ %.2f", receita);
        } else {
            System.out.print("\nAinda nao teve nenhum visitante.");
        }
    }
    public void listarAnimaisPorAmbiente(Ambiente ambiente) {
        for (int i = 0; i < this.listaAmbientes.length; i++) {
            if (this.listaAmbientes[i] != null) {
                if (this.listaAmbientes[i].nome.equalsIgnoreCase(ambiente.nome)) {
                    System.out.printf("\nAmbiente %s e seus ", this.listaAmbientes[i].nome);
                    this.listaAmbientes[i].listarAnimais();
                    return;
                }
            }
        }
    }
}
