import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        Integer[] arr2 = new Integer[1000];

        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0 ;
        int min_val= 0 ;
        for(int i = 0 ; i<n; i++){
            for(int k = i+1; k<n; k++){
                if (arr[i] == arr[k]){
                    cnt = -1;
                    break;
                }
            else{
                if (arr[i]>min_val){
                    min_val = arr[i];
                    cnt = 0 ;
                }
            }
            }
        }
        if (cnt == -1){
            System.out.print(-1);
        }
        else{

        
            System.out.print(min_val);
        }
}
}