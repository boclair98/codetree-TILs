import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] carr = new int[100];
        int n = sc.nextInt();
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
            carr[arr[i]]++;
        }

        

        for(int i = 1 ; i<10; i++){
            System.out.println(carr[i]);
        }





    }
}