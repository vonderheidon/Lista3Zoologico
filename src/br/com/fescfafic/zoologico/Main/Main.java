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
        ambienteAereo1.exibirInfo();
    }
}