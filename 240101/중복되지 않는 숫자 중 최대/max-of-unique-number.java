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
        
        int count = 0 ; 
        int num = 0 ; 
        for(int j = 0 ; j<n; j++){
            int max_val = 0 ;
            for(int k = 0; k<n; k++){

                if(arr[j] == arr[k]){
                    max_val++;
                    break;
                }
            }
            if(max_val==0){
                count++;
                if(num<arr[j]){
                    num = arr[j];
                }
            }
            else{
                count--;
            }
        }

        if (count>0){
            System.out.print(num);
        }
        else{
            System.out.print(-1);
        }
       
        
    }
}