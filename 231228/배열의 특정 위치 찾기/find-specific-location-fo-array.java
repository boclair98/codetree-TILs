import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        int cnt = 0 ;
        int sum = 0 ;
        int sum2 = 0 ;

        for(int i = 0 ; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1 ; i<10; i+=2){
            sum +=arr[i];
        }

        for(int i = 2; i<10; i+=3){
            cnt++;
            sum2 +=arr[i];

        }
        double avg = (double) sum2/cnt;
        System.out.printf("%d %.1f",sum,avg);


            }
}