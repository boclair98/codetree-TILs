import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] arr= new int[n+1];
        int max_val = 100000;
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<=n-t; i++){
            int tal = 0 ;
            for(int j = i ; j<i+t; j++){
                if (arr[j]!=h){
                    tal += Math.abs(arr[j]-h);
                }
                
            }
            max_val = Math.min(max_val,tal);
            
        }
        System.out.print(max_val);
    }
}