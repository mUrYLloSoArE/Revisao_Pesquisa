import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1,nota2,nota3;


        System.out.println("Digite a sua nota de 0 a 100 para " +
                "fazer o cáculo do aproveitamento de notas ");

        System.out.println("");
        System.out.println("Digite a 1 nota ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a 2 nota ");
        nota2 = sc.nextDouble();

        System.out.println("Digite a 3 nota ");
        nota3 = sc.nextDouble();

        double mediaNota=(nota1+nota2+nota3)/3;
        System.out.println("A sua nota final -> " + Math.round(mediaNota));

        double mediaAproveitamento=(nota1+(nota2*2)+(nota3*3)+mediaNota)/7;

        if (mediaAproveitamento >=90){
            System.out.println(" A sua média de aproveitamento -> " + Math.round(mediaAproveitamento)
            + " Conceito A -> parabéns você foi aprovado :D ! "
            );
        }
        else if (mediaAproveitamento >=60 && mediaAproveitamento < 75) {
            System.out.println(" A sua média de aproveitamento -> " + Math.round(mediaAproveitamento)
                    + " Conceito C -> parabéns você foi aprovado :D ! "
            );
        }
        else if (mediaAproveitamento >=40 && mediaAproveitamento <60 ) {
            System.out.println(" A sua média de aproveitamento -> " + Math.round(mediaAproveitamento)
                    + " Conceito D -> Que pena não foi dessa vez, reprovado :( ! "
            );
        }
        else if (mediaAproveitamento >=75 && mediaAproveitamento <90 ) {
            System.out.println(" A sua média de aproveitamento -> " + Math.round(mediaAproveitamento)
                    + " Conceito B -> parabéns você foi aprovado :D ! "
            );
        }
        else {
            System.out.println(" A sua média de aproveitamento -> " + Math.round(mediaAproveitamento)
                    + " Conceito E -> Que pena não foi dessa vez, reprovado :( ! "
            );
        }


        sc.close();

    }

}
