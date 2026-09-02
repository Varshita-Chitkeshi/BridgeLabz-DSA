import java.util.* ;
public class prblm4 {
    public static void printTriangle(int n) {
         if(n>=1 && n<=20) { 
            for(int i = 1 ; i <= n; i++) {
                for(int j = 1 ; j <= i ; j++) {
                    System.out.print(" *");
            }
         System.out.println();
         }
       
        }
        else if(n>20) {
            System.out.println("Floors upto 21 are only accepted");
        }
        else  {
            System.out.println("Please enter valid no. of floors");
        }
    }
    public static void printLine(int n){
        printTriangle(n);
    }
    public static void main(String[] args){
        final int max_height = 20; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of floors");
        int n = sc.nextInt();
        printLine(n);
      

       
        
    } }

