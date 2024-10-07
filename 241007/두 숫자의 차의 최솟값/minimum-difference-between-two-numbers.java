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
        int value = Integer.MAX_VALUE;
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n; j++){
                if(i!=j){
                    if(arr[i]>arr[j]){
                        if(arr[i]-arr[j]<value){
                            value = arr[i] - arr[j];
                        }
                    }
                }
            }
        }
        System.out.print(value);
    }
}