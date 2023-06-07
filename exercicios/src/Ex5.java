import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador=0;
        int qtd_numeros=20;
        int numero=0;

        for (int i = 0; i <qtd_numeros; i++) {
            System.out.println("Digite a " + (i+1) + "º" + " numero ");
            numero=sc.nextInt();
            if (numero > 0 && numero <100){
                contador++;
                System.out.println("Números que estão entre 0 e 100 -> " + numero);
            }
        }
        System.out.println("Quantidade de números -> " + contador);


        sc.close();

    }

}
