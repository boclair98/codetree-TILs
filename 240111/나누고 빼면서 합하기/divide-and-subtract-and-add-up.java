import java.util.Scanner;
public class Main {
    public static int n;
    public static int m;
    public static int cnt ;
    public static int[] arr = new int[100];

    public static int add(int[] arr){
        int sum = 0 ;
        while (cnt>=1){
            sum+=arr[cnt];
            if (cnt%2 == 0){
                cnt = cnt / 2;
            }
            else{
                cnt = cnt -1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 1 ; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        cnt = m;
        

        System.out.print(add(arr));
    }
}