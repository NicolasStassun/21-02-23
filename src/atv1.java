import java.util.Scanner;

public class atv1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double Nota1;
        double Nota2;
        double Nota3;

        System.out.println("Informe a nota do Trabalho de laboratório: ");
        Nota1 =  sc.nextDouble();

        System.out.println("Informe a nota do Trabalho de laboratório: ");
        Nota2 =  sc.nextDouble();

        System.out.println("Informe a nota do Trabalho de laboratório: ");
        Nota3 =  sc.nextDouble();

        double media = (Nota1+Nota2+Nota3)/3;

        if(media>=8 && media<=10){

            System.out.println("A média do aluno é A.");

        }
        else if(media>=7 && media<8){

            System.out.println("A média do aluno é B.");

        }
        else if(media>=6 && media<7){

            System.out.println("A média do aluno é C.");

        }
        else if(media>=5 && media<6){

            System.out.println("A média do aluno é D.");

        }
        else{

            System.out.println("A média do aluno é E.");

        }


    }

}
