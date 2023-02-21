import java.util.Scanner;

public class atv3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;


        System.out.println("Informe a 1° número: ");
        num1 =  sc.nextDouble();

        System.out.println("Informe a 2° número: ");
        num2 =  sc.nextDouble();

        if (num1>num2){

            System.out.println(num1+" > "+num2);

        }
        else if (num1<num2){

            System.out.println(num2+" > "+num1);

        }
        else{

            System.out.println("Os dois números são iguais\n" +
                    num1+" = "+num2);

        }

    }
}
