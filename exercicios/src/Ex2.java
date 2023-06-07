import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor;
        int resultado=0;

        System.out.println("Insira um valor : ");
        valor= sc.nextInt();

        if (valor%2==0){

            resultado=valor+5;
            System.out.println("O número " + valor + " deu par e foi somado 5 ");
            System.out.println("Resultado -> " + resultado);

        }else{

            resultado=valor+8;
            System.out.println("O número " + valor + " deu impar e foi somado 8 ");
            System.out.println("Resultado -> " + resultado);
        }

        sc.close();

    }

}
