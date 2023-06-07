import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

           int a,b;
           int c = 0;

        System.out.println("Insira o valor de A: ");
        a= sc.nextInt();

        System.out.println("Insira o valor de B: ");
        b= sc.nextInt();

        if (a==b || b==a){
            c=a+b;
            System.out.println("Valor de C somado -> " + c);
        }else{
            c=a*b;
            System.out.println("Valor de C multiplicado -> " + c);
        }

        sc.close();

    }

}
