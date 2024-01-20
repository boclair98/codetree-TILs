import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] num = new int[n];

        for(int i = 0 ; i<n; i++){
            num[i] = sc.nextInt();

        }
        int cnt = 0 ;
        for (int i = 0; i<n; i++){

            for(int j = i ; j<n; j++){
                int sum = 0 ;
                for(int k = i; k<=j; k++){
                    sum += num[k];
                }

                double avg = (double)sum / (j - i+1);
                boolean sk = false;
                for(int k = i; k<=j; k ++){
                    if(num[k]==avg){
                        sk = true;
                    }
                }
                if(sk){
                    cnt++;
                }

            }


            
        }
        System.out.print(cnt);


    }
}