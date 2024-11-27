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
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
        Integer[] arrs = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrs,Collections.reverseOrder());
        for(int i = 0; i<arrs.length; i++){
            System.out.print(arrs[i]+" ");
        } 
    }
}