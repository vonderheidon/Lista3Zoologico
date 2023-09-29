package br.com.fescfafic.zoologico.Main;

import br.com.fescfafic.zoologico.Model.Animal;
import br.com.fescfafic.zoologico.Model.AnimalAereo;
import br.com.fescfafic.zoologico.Model.Tubarao;

public class Main {
    public static void main(String[] args) {
        Tubarao tubarao = new Tubarao(
                true,
                "Tubarao Martelo",
                "Carnivoro",
                "Peixes",
                200,
                600
        );
        tubarao.exibirInfo();
    }
}