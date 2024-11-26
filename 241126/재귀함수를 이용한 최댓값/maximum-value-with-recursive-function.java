import java.util.*;
public class Main {
    private static int n;
    private static int[] arr ;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(max(n-1));
        
    }
    public static int max(int number){
        if (number == 0){
            return arr[number];
        }
        return Math.max(max(number-1),arr[number]);
    }

    
}