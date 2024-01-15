import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] new_arr = new int[n];
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i<n;i++){
            new_arr[i] = arr[i];

            if (i%2 == 0 ){
                Arrays.sort(new_arr,0,i+1);

                System.out.print(new_arr[i/2]+" ");
            }
        }



    }
}