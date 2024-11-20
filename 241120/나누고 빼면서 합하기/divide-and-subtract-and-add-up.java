import java.util.Scanner;
public class Main {
    private static final int MAX_SIZE = 101;
    private static int n ;
    private static int m ;
    private static int[] arr = new int[MAX_SIZE];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int now = change();
        System.out.println(now);
    }

    public static int change(){
        int total = 0 ;
        while (m >0){
            if (m%2 == 0){
                total+=arr[m-1];
                m = m / 2;
            }else{
                total+=arr[m-1];
                m = m-1;
            }
        }
        return total;
    }
}