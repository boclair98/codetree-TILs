import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int f = 0;
        int s = 0 ;
        for(int i = 0 ; i<10; i++){
            arr[i] = sc.nextInt();
            if((i+1)%2==0){
                s+=arr[i];
            }else{
                f+=arr[i];
            }
        }
        if (f>s){
            System.out.print(f-s);
        }else{
            System.out.print(s-f);
        }
    }
}