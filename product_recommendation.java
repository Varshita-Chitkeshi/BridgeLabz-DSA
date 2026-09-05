import java.util.Scanner;
public class product_recommendation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] result = new int[n];

        System.out.println("Enter the product quantites");
        for(int i = 0 ; i < n ; i++){
            a[i]=sc.nextInt();

        }
        for(int i = 0; i < n ; i++){
            result[i]=1;
       
            for(int j = 0 ; j <  n ; j++){
            if(i!=j){
                result[i]*=a[j];
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
} 

