import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int count = 0 ;

        for(int i = 0; i<n; i++){
            if(arr[i]==arr2[i]){
                count++;
            }
        }
        if(count == n ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}