import java.util.Scanner ;
public class prblm2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Students name");
        String name = sc.nextLine();
        System.out.println("Enter your roll number");
        int roll_no = sc.nextInt();
        System.out.println("Enter marks of three subjects");
        double toc = sc.nextDouble();
        double maths = sc.nextDouble();
        double os = sc.nextDouble();
        double obtained_marks = toc + maths + os ;
        double total_marks = 300 ;
        double obtained_percentage = (obtained_marks/total_marks)*100;
        System.out.println("Percentage obtained for " + name + " is " + obtained_percentage);

    }
}
