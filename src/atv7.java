import java.util.Arrays;
import java.util.Scanner;

public class atv7{

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int opcao ;
                Double[] nums = new Double[3];


                System.out.println("Valor de I\n" +
                        "Forma a escrever\n" +
                        "1 -" +
                        "A, B, C em ordem crescente\t\n" +
                        "2 -" +
                        "A , B, C em ordem decrescente\n" +
                        "3 -" +
                        "O maior fica entre os outros dois números\n" +
                        "");

                opcao =  sc.nextInt();

                System.out.println("Informe 3 números sem ordem definida");

                System.out.println("Informe a 1° número: ");
                nums[0] =  sc.nextDouble();

                System.out.println("Informe o 2° número: ");
                nums[1] =  sc.nextDouble();

                System.out.println("Informe o 3° número: ");
                nums[2] =  sc.nextDouble();

                if (opcao==1){

                    ordem(nums);
                    System.out.println(Arrays.toString(nums));

                }
                else if (opcao==2){

                    ordem(nums);
                    reverse(nums);
                    System.out.println(Arrays.toString(nums));

                }
                else if (opcao==3){

                    maior(nums);
                    System.out.println(Arrays.toString(nums));

                }

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
            public static void ordem(Double[]nums){

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
            }
            public static void maior(Double[]nums){

                double aux = 0.0;
                for (int i=0;i<= nums.length;i++){

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
                nums[0]=aux;
    }


        }
