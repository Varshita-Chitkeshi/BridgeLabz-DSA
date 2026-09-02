public class commandline {
    public static void main(String[] args){
        if(args.length > 0){

            System.out.println("Hello " + args[0] + args[1] + "! Welcome to java") ;

        }
        else{
            System.out.println("Hello Guest! Welcome to java");
        }
    }
}