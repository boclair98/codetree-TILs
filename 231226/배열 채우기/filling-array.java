import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        
        for(int i = 0; i<9; i++){
            int a = sc.nextInt();

            if (a==0){
                break;
            }
            else{
                arr[i] = a;
                cnt++;
            }
        }
        
        for(int k = cnt-1 ;k>=0; k--){
            System.out.print(arr[k]+" ");
        }
    }
}