import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        int max_val = 0 ;
        int max2_val = 0 ;

        for (int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i<n ; i++){
            if(arr[i]>max_val){
                max_val = arr[i];
            }
        }

        for(int i = 0 ; i<n; i++){
            if(arr[i]== max_val){
                continue;
            }
            else if(arr[i]>max2_val){
                max2_val = arr[i];
            }
        }
        System.out.printf("%d %d",max_val,max2_val);
    }
}