import java.util.Scanner;

public class atv2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double Nota1;
        double Nota2;
        double Nota3;

        System.out.println("Informe a 1° nota: ");
        Nota1 =  sc.nextDouble();

        System.out.println("Informe a 2° nota: ");
        Nota2 =  sc.nextDouble();

        System.out.println("Informe a 3° nota: ");
        Nota3 =  sc.nextDouble();

        double media = (Nota1+Nota2+Nota3)/3;
        double notaExame = 12-media;

        if(media>=0 && media<=3){
            System.out.println("Reprovado");
        }
        else if(media>3 && media<=6){

            System.out.println("Você ficou de Exame e precisa tirar "+notaExame+" para ser Aprovado");

        }
        else{

            System.out.println("Aprovado");

        }

    }

}
