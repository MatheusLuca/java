import java.util.Scanner;

public class ExemploEntradaDados {


    //Criar um programa para ler e calcular a media da FIAP
    public static void main(String[] args) {

        //Criar o objeto para ler o teclado.
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota da CP1: ");
        double cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da CP2: ");
        double cp2 = leitor.nextDouble();

        double mediaCps = (cp1 + cp2) / 2;

        System.out.println("Digita GS1: ");
        double gs1 = leitor.nextDouble();

        System.out.println("Digita GS2:");
        double gs2 = leitor.nextDouble();

        double mediaGs = (gs1 + gs2) / 2;

        System.out.println("Digite Challange1: ");
        double ch1 = leitor.nextDouble();

        System.out.println("Digite Challange2: ");
        double ch2 = leitor.nextDouble();

        double mediaCh = (ch1 + ch2) / 2;

        double mediaFinal = ( (mediaCps * 0.2) + ( mediaCh * 0.2) + ( mediaGs * 0.6) );
        System.out.println("Media final foi de? " + mediaFinal);

    }

}
