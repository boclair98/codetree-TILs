import java.util.Scanner;
public class Main {
    public static void change(int[] arr){
        for (int i = 0 ; i<arr.length; i++){
            if (arr[i]%2 == 0){
                System.out.print(arr[i]/2+" ");
            }else{
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        change(arr);
    }
}