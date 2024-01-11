import java.util.Scanner;
public class Main {
    public static int n ; 
    public static int m ;
    public static int[] arr = new int[101];
    

    public static int add(int a , int b){
        int sum = 0;
        for(int i = a; i<=b; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 1; i <=n; i++ ){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(add(a,b));
        }
    }
}