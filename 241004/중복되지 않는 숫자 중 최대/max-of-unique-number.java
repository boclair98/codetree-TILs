import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];

        for(int i = 0 ; i<n ; i++){
            arr2[arr[i]-1]++;
        }
        
        int max_val = -1;

        for(int i = 0 ; i<n; i++){
            if(arr2[i]>max_val){
                max_val = arr2[i];
            }else if (arr2[i]==max_val){
                max_val = -1;
                break;
            }
        }
        System.out.print(max_val);
    }
}