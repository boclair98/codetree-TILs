import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        System.out.print(arr[0]+" "+arr[1]);
    }
}