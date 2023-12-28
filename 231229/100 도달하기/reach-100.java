import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];
        arr[1] = 1;
        arr[2] = n ;

        for(int i =3 ; i<101; i++){
            arr[i] = arr[i-2] + arr[i-1];
        
        }
        for(int i = 1 ; i<101; i++){
            if (arr[i]>=100){
                System.out.print(arr[i]);
                break;
            }
            else{
                System.out.print(arr[i]+" ");
            }
        }
    }
}