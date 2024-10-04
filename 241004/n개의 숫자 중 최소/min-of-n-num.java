import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int value = Integer.MAX_VALUE;
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<value){
                value = arr[i];
            }

        }
        int cnt = 0;
        for(int i = 0; i<n; i++){
            if(value == arr[i]){
                cnt++;
            }
        }
        System.out.print(value+" "+cnt);

    }
}