import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma=0;
        int numero=0;
        boolean condicao=true;

        List lista = new ArrayList();

        while (condicao == true){
            System.out.println("Digite o  numero ");
            numero=sc.nextInt();
            lista.add(numero);
            if (numero < 0 ){
                numero=0;
                System.out.println(" Programa encerrado, número inválido! ");
                System.out.println(" Números Digitados -> " + lista);
                System.out.println(" Soma dos números -> " + soma);
                return;
            }
            soma+=numero;
        }

        sc.close();

    }

}
