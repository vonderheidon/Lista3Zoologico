package br.com.fescfafic.zoologico.Main;

import br.com.fescfafic.zoologico.Model.*;

public class Main {
    public static void main(String[] args) {
        Tucano tucano = new Tucano(
                40,
                "Tucano Azul",
                "Carnivoro",
                "Aves",
                2,
                60
        );
        Tartaruga tartaruga = new Tartaruga(
                true,
                "Tartaruga Silvestre",
                "Onivoro",
                "Repteis",
                300,
                25
        );
        Leopardo leopardo = new Leopardo(
                4,
                "Leopardo dente de lixa",
                "Carnivoro",
                "Mamiferos",
                230,
                140
        );
        AmbienteAereo ambienteAereo1 = new AmbienteAereo(
                "Tucanos",
                30,
                true,
                false,
                12,
                2,
                16,
                8
        );
        AmbienteAquatico ambienteAquatico1 = new AmbienteAquatico(
                "Tartarugas",
                50,
                false,
                false,
                12,
                0,
                1,
                3
        );
        AmbienteTerrestre ambienteTerrestre1 = new AmbienteTerrestre(
                "Leopardos",
                200,
                true,
                true,
                "Arenoso",
                23,
                2,
                4
        );
        ambienteTerrestre1.adicionarAnimal(leopardo);
        ambienteTerrestre1.exibirInfo();
    }
}