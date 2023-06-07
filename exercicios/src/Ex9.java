import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vetorA []= new int[50];
        int valor=101;

        for (int i = 0; i < 50; i++){
            vetorA[i] = valor;
            valor++;
            System.out.println(vetorA[i] + " posição " + (i+1));
        }


        sc.close();

    }

}
