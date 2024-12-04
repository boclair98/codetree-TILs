import java.util.*;
public class Main {
    public static int n,total,len;
    public static int[] arr = new int[1001];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        total = 1;
        int max_val = 1 ;
        for(int i =1; i<n; i++){
            if(arr[i]==arr[i-1]){
                total++;
            }else{
                total = 1;
            }
            if(total>max_val){
                max_val = total;
            }
        }
        System.out.println(max_val);
    }
}