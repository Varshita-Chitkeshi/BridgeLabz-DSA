import java.util.Scanner;
public class highest_score{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of players");
    int n = sc.nextInt();
    int[] arr = new int[n];
    int max = arr[0] ;
    System.out.println("Enter the score of the players");
    for(int i = 0 ; i < arr.length ; i++){
        arr[i]=sc.nextInt();
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println(max);
    sc.close();
}
   }
    