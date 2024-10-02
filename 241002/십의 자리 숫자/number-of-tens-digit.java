import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] ar = new int[10];

        for(int i = 1 ; i<=100; i++){
            arr[i] = sc.nextInt();
            if (arr[i]==0){
                break;
            } ar[arr[i]/10]+=1;
        }
        for(int i = 1 ; i<10; i++){
            System.out.println((i)+" - "+ar[i]);
        }
    }
}