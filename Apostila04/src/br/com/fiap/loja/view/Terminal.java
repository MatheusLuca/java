package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Fornecedor;
import br.com.fiap.loja.model.Produto;
import java.util.Scanner;

//Responsável por interagir com o usuário
public class Terminal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Ler as informações do Produto (sem fornecedor por enquanto)
        System.out.println("Digite o nome do produto");
        String nomeProduto = entrada.next() + entrada.nextLine();

        System.out.println("Digite o valor do produto");
        double valor = entrada.nextDouble();

        System.out.println("Digite o código do produto");
        int codigo = entrada.nextInt();

        System.out.println("O produto está disponível? (true/false)");
        boolean disponivel = entrada.nextBoolean();

        //Instanciar a classe produto
        Produto product = new Produto();
        // Instanciando o objeto fornecedor.
        // Produto tem relação com fornecedor.
        Fornecedor supplier = new Fornecedor();

        System.out.println("Insira o CNPJ do fornecedor");
        String cnpjFornecedor = entrada.next();
        entrada.nextLine();
        System.out.println("Insira o nome do fornecedor");
        String nomeFornecedor = entrada.nextLine();
        // objeto supplier no campo cnpj vai receber o input do cnpjFornecedor
        // objeto supplier no campo nome vai receber o input do cnpjFornecedor
        supplier.cnpj = cnpjFornecedor;
        supplier.nome = nomeFornecedor;


        //Colocar as informações no objeto produto
        product.nome = nomeProduto;
        product.preco = valor;
        product.codigo = codigo;
        product.disponivel = disponivel;
        // Colocar o fornecedor no produto
        product.fornecedor = supplier;


        //Exibir as informações do objeto produto
        System.out.println(product.nome );
        System.out.println(product.preco);
        System.out.println(product.codigo);
        System.out.println(product.disponivel);
        System.out.println("Informações de fornecedores: ");
        System.out.println(product.fornecedor.cnpj);
        System.out.println(product.fornecedor.nome);
        
    }
}
