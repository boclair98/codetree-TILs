import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int total = 0 ;
        int cnt = 0 ;
        while (true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            arr[cnt] = n;
            cnt++;
        }

        for(int i =cnt-1; i>=cnt-3; i--){
            total+=arr[i];
        }
        System.out.print(total);
    }
}