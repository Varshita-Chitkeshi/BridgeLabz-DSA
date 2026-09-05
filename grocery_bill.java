import java.util.Scanner;

public class grocery_bill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] list = new double[4];

        System.out.println("Enter the prices of 4 items:");

        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextDouble();
        }

        System.out.println("Total bill is:");

        double total = 0;

        for (int j = 0; j < list.length; j++) {
            total += list[j];
        }

        System.out.println(total);

        sc.close();
    }
}