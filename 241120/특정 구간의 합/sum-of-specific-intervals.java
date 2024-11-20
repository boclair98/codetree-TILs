import java.util.Scanner;
public class Main {
    private static int n ;
    private static int m ;
    private static int[] arr = new int[100] ;
    public static int sum(int num1, int num2){
        int total = 0 ;
        for(int i =num1-1; i<num2; i++){
            total+=arr[i];
        }
        return total;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i<m; i++){
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(sum(c,d));
        }



    }
}