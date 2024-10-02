import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int k = 0;
        for(int i = 0 ; i<100; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                k = i-1;
                break;
            } else if(arr[i]%2==0){
                System.out.print(arr[i]/2+" ");
            }else{
                System.out.print(arr[i]+3+" ");
            }
        }   
    }
}