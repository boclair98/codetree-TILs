import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int sum = 0 ;
        for(int i = 0; i<100; i++){
            int nw = sc.nextInt();
            if (nw !=0){
                sum+=nw;
            }
            else{
                break;
            }
        }
        System.out.print(sum);
    }
}