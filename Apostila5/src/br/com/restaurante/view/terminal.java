package br.com.restaurante.view;

import br.com.restaurante.model.Funcionario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class terminal {
    public static void main(String[] args) {
        //Criar um objeto funcionário

        Funcionario f = new Funcionario();

        f.setNome("Andre");
        f.setId(45);
        f.setSexo('m');
        f.setAtivo(true);
        f.setSalario(15000);

        System.out.println(f.getNome());
        System.out.println(f.getId());
        System.out.println(f.getSexo());
        System.out.println(f.isAtivo());
        System.out.println(f.getSalario());


    }
}