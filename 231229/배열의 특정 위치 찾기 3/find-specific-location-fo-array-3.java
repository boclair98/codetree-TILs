import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int sum = 0 ;
        for(int i = 0; i<100; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                sum = i;
                break;
            }
        }
        System.out.print(arr[sum - 3] + arr[sum - 2] + arr[sum - 1]);
    }
}