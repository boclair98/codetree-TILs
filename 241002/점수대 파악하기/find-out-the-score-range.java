import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        int[] exam = new int[11];

        for(int i = 0 ; i<100; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                break;
            }
            exam[arr[i]/10]+=1;
        }

        for(int i =10; i>=1; i--){
            System.out.println(i*10+" - "+exam[i]);
        }

    }
}