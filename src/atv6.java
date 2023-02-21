import java.util.Scanner;

public class atv6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;

        System.out.println("Informe a 1° número: ");
        num1 =  sc.nextInt();

        if((num1%2)==0){

            System.out.println("Número é par");

        }
        else{

            System.out.println("Número é ímpar");

        }

    }

}
