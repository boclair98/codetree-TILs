import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[101];
        int[] narr = new int[101];

        for(int i = 0 ; i<101; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                break;
            }
            narr[arr[i]/10 * 10]++;
        }
        for(int i = 100; i>=10; i=i-10){
            System.out.println(i+" - "+narr[i]);
        }
    }
}