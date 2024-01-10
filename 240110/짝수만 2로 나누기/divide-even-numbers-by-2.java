import java.util.Scanner;
public class Main {
    public static int n ;
    public static int[] arr = new int[50];

    public static void jak(int[] arr){

        for(int i = 0 ; i<n; i++){
            if (arr[i] %2  == 0){
                arr[i]= arr[i]/2 ;
            }
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        jak(arr);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
 


    }
}