import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[101];
        arr[1] = n ; 
        arr[2] = m ;

        for(int i = 3; i<11; i++){
            arr[i] = 2*arr[i-2] + arr[i-1];
        
        }

        for(int i = 1; i<11; i++){
            System.out.print(arr[i]+" ");
        }
    }
}