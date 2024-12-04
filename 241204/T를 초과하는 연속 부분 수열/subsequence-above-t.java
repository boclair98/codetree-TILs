import java.util.*;
public class Main {
    public static int n,t,reset;
    public static int[] arr = new int[2001];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reset = 1;
        int max_val = 0; 
        for(int i = 1; i<n; i++){
            if(arr[i]>t && arr[i-1]>t){
                if(arr[i]>arr[i-1]){
                    reset++;
                }else{
                    reset ++;
                }
            }else{
                reset = 1;
            }
            max_val = Math.max(max_val,reset);
        }
        System.out.println(max_val);
    }
}