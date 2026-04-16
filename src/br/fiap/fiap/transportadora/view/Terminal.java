package br.fiap.fiap.transportadora.view;

import br.fiap.fiap.transportadora.model.Produto;

public class Terminal {
    public static void main(String[] args) {
        Produto prod = new Produto();

        prod.setId(1);
        prod.setNome("Sargadim");
        prod.setFragil(true);
        prod.setPeso(0.250);
        prod.setVolume(1);


    }
}
