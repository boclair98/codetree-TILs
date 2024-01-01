import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int total = 0 ;
        int[][] arr = new int[2][4];
        for (int i = 0 ; i<2; i++){
            for(int j = 0 ; j<4;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0 ; i<2; i++){
            int sum_val = 0 ;
            for(int j = 0 ; j<4; j++){
                sum_val += arr[i][j];

            }
            total+=sum_val/4;
            System.out.printf("%.1f ",(double)sum_val/4);
            
        }
        System.out.println();

        for(int i = 0 ; i<4; i++){
            int sum2_val = 0 ;
            for(int j = 0 ; j<2; j++){
                sum2_val+=arr[j][i];
            
            }
            total+=sum2_val/2;
            System.out.printf("%.1f ", (double)sum2_val/2);
        }
        System.out.println();
        System.out.printf("%.1f",(double)total/6);

        
    }
}