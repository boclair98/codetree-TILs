import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(arr[0]+" ");
        for(int i = 2; i<n; i+=2){
            int[] total = new int[i+1];
            for(int s = 0; s<i; s++){
                total[s] = arr[s];
            }
            System.out.print(total[i/2]+" ");
        }
    }
}