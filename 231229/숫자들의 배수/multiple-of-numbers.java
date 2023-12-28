import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[11];
        int cnt = 1 ;

        for(int i = 0; i<10; i++){
            arr[i] = n;
        }
        for(int i = 0 ; i<10; i++){
            arr[i] *=cnt;
            cnt++;
        }

        for(int i = 0 ; i<10; i++){
            System.out.print(arr[i]+" ");
        }
    }
}