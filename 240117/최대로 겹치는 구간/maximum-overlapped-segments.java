import java.util.Scanner;
public class Main {
    public static int n;
    public static int[] num = new int[200];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int max_val = 0 ;
        for (int i = 0 ; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a+100; j<b+100; j++){
                num[j] +=1;
            }
            
            for(int k = 0; k<200; k++){
                if (num[k]>max_val){
                    max_val = num[k];
                }
            }
        }
        System.out.print(max_val);
    }
}