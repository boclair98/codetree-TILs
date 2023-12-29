import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int tal = 0 ;
        int[] arr = new int[100];

        while(a!=0){
            
            
            arr[a%b]++;
            a= a/b;
        }
        int sum = 0;
        for(int i = 0 ; i<b; i++){
            sum = arr[i]*arr[i] + sum;
        }
        System.out.print(sum);
    }
}