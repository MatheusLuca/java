public class ExemploCarro {


    public static void main(String[] args) {
        //Criar um objeto do tipo carro
        //Carro é o tipo da variavel como em string, double, float
        //carro1 seria nome, salario, idade.
        //new Carro() uma nova instancia / objeto um novo carro da classe carro
        Carro gol = new Carro();

        //Colocar valores nos atributos do objeto
        gol.cor = "Prata";
        gol.velocidadeMaxima = 190;
        gol.ano = 2010;
        gol.modelo = "Gol Especial Bola";
        gol.peso = 10.000;
        gol.automatico = false;
        gol.altura = 1.2f;

        System.out.println("Cor: " + gol.cor);
        System.out.println("Velocidade Máxima: " + gol.velocidadeMaxima);
        System.out.println("Ano: " + gol.ano);
        System.out.println("Modelo: " + gol.modelo);
        System.out.println("Peso: " + gol.peso );
        System.out.println("Cambio: " + gol.automatico);
        System.out.println("Altura: " + gol.altura);


        //Criar um novo objeto do tipo carro
        //Atribuir valores para 2 atribuitos e exibir esses valores

        Carro celta = new Carro();
        System.out.println("Dados do celta!");
        celta.cor ="Preto";
        celta.automatico = true;
        celta.velocidadeMaxima = 400;

        //Imprimindo os valores do Celta
        System.out.println("Cor: " + celta.cor);
        System.out.println("Cambio: " + celta.automatico);
        System.out.println("Velocidade Máxima: " + celta.velocidadeMaxima);




    }



}
