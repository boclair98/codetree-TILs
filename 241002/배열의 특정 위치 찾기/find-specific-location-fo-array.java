import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int total = 0;
        int cnt = 0;
        int thr = 0;

        for(int i = 0 ; i<10; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                total+=arr[i];
            }else if(arr[i]%3==0){
                thr+=arr[i];
                cnt++;
            }
        }
        double avg = (double) thr / cnt;
        System.out.printf("%d %.1f",total,avg);

    }
}