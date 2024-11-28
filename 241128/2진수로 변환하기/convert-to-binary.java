import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = 0;
        int[] arr = new int[100];
        while (true){
            if( n < 1){
                break;
            }
            arr[idx++] = n % 2;
            n = n / 2;
        }
        for(int i = idx-1 ; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}