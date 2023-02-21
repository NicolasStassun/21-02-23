import java.util.Scanner;

public class atv4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double[] num = new Double[3];


        System.out.println("Informe a 1° número: ");
        num[0] =  sc.nextDouble();

        System.out.println("Informe a 2° número: ");
        num[1] =  sc.nextDouble();

        System.out.println("Informe a 3° número: ");
        num[2] =  sc.nextDouble();

        for (int i=0;i<= num.length;i++){

            double aux;
            for(i = 0; i<num.length; i++){
                for(int j = 0; j< num.length-1; j++){
                    if(num[j] > num[j + 1]){
                        aux = num[j];
                        num[j] = num[j+1];
                        num[j+1] = aux;
                    }
                }
            }

        }
        for (int z=0;z<num.length;z++){

            System.out.println(num[z]);

        }


    }

}
