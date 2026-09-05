import java.util.Scanner;
public class average_calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students");
        int n = sc.nextInt();
        double[] marks= new double[n];
        System.out.println("Enter the marks of the student");
        double total = 0 ; 
        for(int i = 0 ; i < marks.length ; i++){
            marks[i]=sc.nextInt();
            total=total+marks[i];
            
        }
        
        System.out.println(total);
        double average = total/n ;
        System.out.println(average);
        sc.close();
    }
}
