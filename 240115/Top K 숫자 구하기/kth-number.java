import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.print(arr[m-1]);
    }
}