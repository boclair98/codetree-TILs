import java.util.Scanner;
public class Main {
    public static final int MAX_N = 50;
    public static int n ;
    public static int[] arr = new int[MAX_N];

    public static void change(int[] arr){
        for (int i = 0; i<n; i++){
            if(arr[i]<0){
                arr[i] = -arr[i];
            }
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        change(arr);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}