package br.fiap.fiap.transportadora.view;

import br.fiap.fiap.transportadora.model.Funcionario;
import br.fiap.fiap.transportadora.model.Profissao;

public class TerminalFuncionario {
    public static void main(String[] args) {
        Profissao tornerio = new Profissao("Torneiro");
        Funcionario funcionario1 = new Funcionario(1236, "Marcos", tornerio);
        System.out.println(funcionario1.toString());
    }
}
