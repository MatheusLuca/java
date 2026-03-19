public class ExemploOperadores {


    public static void main(String[] args) {

        int n = 100;
        System.out.println(n);
        // n++ incrementa a variavel em 1 unidade
        ++n;
        System.out.println(n);

        n--; //Decrementa a variavel em 1 unidade
        System.out.println(n);

        n+=10;
        System.out.println(n + "Novo valor de n");
        n-= 50;
        System.out.println(n); //50
        n*=3;
        System.out.println(n); //300
        n/=2;
        System.out.println(n); // 50
        n%=5;
        System.out.println(n); // 0
    }
}
