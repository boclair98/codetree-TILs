import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[1000];
        int idx = 0 ;
        while(true){
            if(n < b){
                arr[idx++] = n;
                break;
            }
            arr[idx++] = n % b;
            n = n / b;

        }
        int total = 0 ;
        for(int i = idx-1; i>=0; i--){
            System.out.print(arr[i]+"");
        }
        
    }
   

}