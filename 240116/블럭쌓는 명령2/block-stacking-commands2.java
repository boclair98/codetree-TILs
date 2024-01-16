import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[101];
        int max_val = 0 ;
        for (int i = 0 ; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j<=b; j++){
                arr[i]+=1;
            }

            for(int z = 1 ; z<n; z++){
                if (arr[z]>max_val){
                    max_val = arr[z];
                }
            }
        }
        System.out.print(max_val);
    }
}