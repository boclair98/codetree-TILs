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
        int value = 0;

        for(int i = 0 ; i<n; i++){
            for(int j = i ; j<n; j++)
                if (arr[i]<arr[j]){
                    if(arr[j]-arr[i]>value){
                        value = arr[j] - arr[i];
                    }
                }
        }
        System.out.print(value);

    }
}