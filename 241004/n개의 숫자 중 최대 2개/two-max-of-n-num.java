import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int value1 = 0 ;
        int value2 = -Integer.MAX_VALUE ;
        int idx = -1 ;
        for(int i = 0; i<n; i++){
            if(arr[i]>value1){
                value1 = arr[i];
                idx = i ;
            }
        }
        for(int i = 0; i<n; i++){
            if(arr[i]>value2 && idx!=i){
                value2 = arr[i];
            }
        }
        System.out.print(value1+" "+value2);
    }
}