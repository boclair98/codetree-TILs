import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[202];
        int max_val = 0 ;
        for (int i = 0 ; i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j<b; j++){
                num[j]+=1;
            }
            
            for(int k = 1; k<202; k++){
                if (max_val < num[k]){
                    max_val = num[k];
                }
            }
        }
        System.out.print(max_val);
    }
}