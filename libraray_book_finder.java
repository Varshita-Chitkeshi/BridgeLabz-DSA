
public class libraray_book_finder {
    public static int book_finder(int[] arr,int book_id){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==book_id){
                return i ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,8,6};
        System.out.println(book_finder(arr,8));
    }
}
