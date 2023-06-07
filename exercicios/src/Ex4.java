import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma=0;
        double media=0.0;
        int idade=0;

        int idades[]= new  int[20];

        for (int i = 0; i <idades.length; i++) {
            System.out.println("Digite a " + (i+1) + "º" + " idade ");
            idade= sc.nextInt();
            soma+=idade;
            media=soma/idades.length;
        }

        System.out.println("A média das idade é -> " + Math.round(media));





        sc.close();

    }

}
