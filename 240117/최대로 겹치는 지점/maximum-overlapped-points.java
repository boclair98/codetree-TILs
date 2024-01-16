import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[101];
        int maxval = 0 ;
        for (int i = 0 ; i < n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j<=b; j++){
                num[j]+=1;
            }

            for(int k = 0 ; k<101; k++){
                if (num[k]>maxval){
                    maxval = num[k];
                }
            }
        }
        System.out.print(maxval);
    }
}