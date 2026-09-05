import java.util.Scanner;
public class prblm5 { 
    final int MAX_MARKS=100;
    final int subjects = 5 ;
    public static double student_percentage(double a , double b , double c , double d , double e) {
        double percentage = ((a+b+c+d+e)/500)*100 ;
        
        char grade ;
        if(percentage>=90 && percentage <= 100){
            grade = 'A' ;
        }
        else if (percentage>=80 && percentage<90) {
            grade = 'B';
        }
        else if (percentage >= 70 && percentage < 80) {
            grade = 'C';
        }
        else if (percentage >= 60 && percentage < 70) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        switch(grade){
            case 'A':
                System.out.println("Grade A");
                break ;
            case 'B':
                System.out.println("Grade B");
                break;
            case 'C':
                System.out.println("Grade C");
                break;
            case 'D':
                System.out.println("Grade D");
                break;
            case 'E':
                System.out.println("Grade F");
        
        }
        return percentage; 

    }
    public static double  total_marks(double a , double b , double c , double d , double e) {
        double obtained_marks = a+b+c+d+e;
        return obtained_marks ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of the subjects");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();
        double e = sc.nextInt();
        double percent_result=student_percentage(a,b,c,d,e);
        double marks_result=total_marks(a,b,c,d,e);
        System.out.println(percent_result);
        System.out.println(marks_result);
        sc.close();
    } 
}


