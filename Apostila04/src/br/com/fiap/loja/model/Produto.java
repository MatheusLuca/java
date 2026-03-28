package br.com.fiap.loja.model;

public class Produto {

    //public - modificador de acesso, deixando disponivel para todos
    public double preco;
    public int codigo;
    public String nome;
    public boolean disponivel;
    public Fornecedor fornecedor;

    public double calcularDesconto(){
        double desconto = preco * 0.2;
        return desconto;
    }

    public void aumentarPreco(double procentagem){
        preco += preco * (procentagem / 100);
    }

    //tarefa criar um metodo para calcular o valor total da compra
    // dado a quantidade, calcular o valor da compra comprou 10 produtos quanto da no final


}
