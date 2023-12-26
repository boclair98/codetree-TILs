import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0 ;
        int cnt = 0 ;
        int tal = 0 ;
        for(int i = 0 ; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i<10; i++){
            if(arr[i]!=0){
                cnt++;
            }
            else{
                break;
            }
        }

        for(int k = 0; k<cnt; k++){
            if(arr[k]%2==0){
                sum = sum+arr[k];
                tal ++;
            }
        }
        System.out.printf("%d %d",tal,sum);
    }
}