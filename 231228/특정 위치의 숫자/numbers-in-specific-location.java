import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int[] arr = new int[10];
        for(int i = 0 ; i<10; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0 ;
        sum = arr[2] + arr[4] + arr[9];
        System.out.print(sum);
    }
}