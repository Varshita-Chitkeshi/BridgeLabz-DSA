public class prblm6 {
    public static long FactorialRecursive(int n) {
        if(n<0) {
            return -1;
        }
        return n * FactorialRecursive(n-1) ;
    }
    public static long FactorialIterative(int n) {
        int result = 1;
        for(int i = 2 ; i <= n ; i++){
            result*=i;
        }
        return result;
    }
    public static void demonstratepassByValue(int number){
        number = number*10;
        System.out.println("Inside number" + number); }
    public static void main(String[] args) { 
        int n = 5;
        System.out.println("Iterative function of " + n + " " +FactorialIterative(n));
        System.out.println("Recursive function of " + n + " "+  FactorialRecursive(n));
        int original = 7 ; 
        System.out.println("Before method call" + original);
        demonstratepassByValue(5);
        System.out.println("After method call" +original);
        
    
}
}