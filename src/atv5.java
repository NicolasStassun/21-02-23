import java.util.Arrays;
import java.util.Scanner;

public class atv5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double[] num = new Double[3];
        Double[] nums = new Double[4];


        System.out.println("Informe 3 números em ordem crescente");

        System.out.println("Informe a 1° número: ");
        num[0] =  sc.nextDouble();

        System.out.println("Informe a 2° número: ");
        num[1] =  sc.nextDouble();

        System.out.println("Informe a 3° número: ");
        num[2] =  sc.nextDouble();

        System.out.println("Informe 4 números sem ordem definida");

        System.out.println("Informe a 1° número: ");
        nums[0] =  sc.nextDouble();

        System.out.println("Informe a 2° número: ");
        nums[1] =  sc.nextDouble();

        System.out.println("Informe a 3° número: ");
        nums[2] =  sc.nextDouble();

        System.out.println("Informe a 4° número: ");
        nums[3] =  sc.nextDouble();

        for (int i=0;i<= nums.length;i++){

            double aux;
            for(i = 0; i<nums.length; i++){
                for(int j = 0; j< nums.length-1; j++){
                    if(nums[j] > nums[j + 1]){
                        aux = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = aux;
                    }
                }
            }

        }
        reverse(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void reverse(Double[] nums)
    {
        Double[] temp = new Double[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[nums.length - 1 - i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }


}
