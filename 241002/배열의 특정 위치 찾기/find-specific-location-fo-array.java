import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int total = 0;
        int cnt = 0;
        int thr = 0;

        for(int i = 1 ; i<=10; i++){
            arr[i-1] = sc.nextInt();
            if(i%2==0){
                total+=arr[i-1];
            }else if(arr[i-1]%3==0){
                thr+=arr[i-1];
                cnt++;
            }
        }
        double avg = (double) thr / cnt;
        System.out.printf("%d %.1f",total,avg);

    }
}