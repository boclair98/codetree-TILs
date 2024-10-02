import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] ju = new int[6];

        for(int i = 0 ; i<10; i++){
            arr[i] = sc.nextInt();
            ju[arr[i]-1]+=1;
        }
        for(int i = 0 ; i<6; i++){
            System.out.println((i+1)+" - "+ju[i]);
        }
    }
}