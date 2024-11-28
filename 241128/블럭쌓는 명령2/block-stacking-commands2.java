import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        int max_val = -1 ;
        for(int i = 0; i<k; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int s =a; s<=b; s++){
                arr[s] = arr[s] + 1;
            }
        }

        for(int i = 1; i<=n; i++){
            if(arr[i] > max_val){
                max_val = arr[i];
            }
        }
        System.out.println(max_val);
    }
}