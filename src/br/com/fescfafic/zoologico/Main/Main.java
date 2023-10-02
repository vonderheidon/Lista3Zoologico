package br.com.fescfafic.zoologico.Main;

import br.com.fescfafic.zoologico.Model.*;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Tucano tucano = new Tucano(
                40,
                "Tucano-Toco",
                "Onivoro",
                "Aves",
                0.54,
                60
        );
        Tartaruga tartaruga = new Tartaruga(
                false,
                "Tartaruga-Verde",
                "Onivoro",
                "Repteis",
                200,
                164
        );
        Leopardo leopardo = new Leopardo(
                4,
                "Leopardo-Persa",
                "Carnivoro",
                "Mamiferos",
                89,
                150
        );
        AmbienteAereo ambienteAereo1 = new AmbienteAereo(
                "Tucanos Americanos",
                30,
                true,
                false,
                12,
                2,
                16,
                8
        );
        AmbienteAquatico ambienteAquatico1 = new AmbienteAquatico(
                "Tartarugas Marinhas",
                50,
                false,
                false,
                12,
                0,
                1,
                3
        );
        AmbienteTerrestre ambienteTerrestre1 = new AmbienteTerrestre(
                "Leopardos Persas",
                200,
                true,
                true,
                "Arenoso",
                23,
                2,
                4
        );
        Zoologico zoologico = new Zoologico(
                "Animais Maneiros",
                "Rua das flores, nº 200",
                LocalTime.of(7,0),
                LocalTime.of(18,0),
                150,
                3,
                2
        );
        System.out.printf("- Metodos animais");
        tucano.exibirInfo();
        tucano.locomover();
        leopardo.locomover();
        tartaruga.comer();
        System.out.printf("\n-----------------------\n");
        System.out.printf("- Metodos ambientes");
        ambienteAereo1.adicionarAnimal(tucano);
        ambienteAereo1.exibirInfo();
        System.out.printf("\n-----------------------\n");
        System.out.printf("- Metodos zoologico");
        zoologico.adicionarAmbiente(ambienteAereo1);
        zoologico.exibirInfo();
        zoologico.verificarFuncionamento();
        zoologico.registrarVisitante("Marcio");
        zoologico.calcularReceita();
        zoologico.listarAnimaisPorAmbiente(ambienteAereo1);
        zoologico.listarAnimaisPorAmbiente(ambienteAquatico1);
    }
}