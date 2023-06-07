import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ex8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> lista = new ArrayList();


        String nome="";
        double salario=0.0;
        double porcentagem=0.1;
        double salario_ajustado=0.0;


        int funcionarios;
        System.out.println(" Digite quantos funcionários a sua empresa tem ");
        funcionarios=sc.nextInt();

        double[] dados = new double[funcionarios];


        for (int i=0; i<dados.length; i++){

            System.out.println("Entre com os dados do " + (i+1) + "º" + " Funcionário ");
            System.out.println("Nome: ");
            nome=sc.next();

            System.out.println("Salário: ");
            salario=sc.nextDouble();

            if(salario <0){
                System.out.println("Dados inválidos, programa encerrado, tente novamente! ");
                break;
            }

            lista.add(nome);
            lista.add(String.valueOf(salario));
            salario_ajustado=salario+(salario*porcentagem);

            System.out.println("Nome do Funcionário -> " + nome);
            System.out.println("Salário do Funcionário -> " + salario);
            System.out.println("Salário do Funcionário Ajustado -> " + salario_ajustado);
            System.out.println();


        }

        sc.close();

    }

}
