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
        int max_val = 0 ;
        int count = 0 ; 
        

        for(int i = 0 ; i<n; i++){
            boolean tr = true;
            int cnt = 0 ;
            for(int k = i+1; k<n; k++){
                if(arr[i] == arr[k]){
                    tr = false;
                    break;
                }
            }
            if(tr ==true){
                if(max_val<=arr[i]){
                    max_val = arr[i];
                    count++;
                }
                
            }
        }
        if(count>0){
            System.out.print(max_val);
        }
        else{
            System.out.print(-1);
        }

       
        
    }
}