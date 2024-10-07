import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        for(int i = 0 ; i<2; i++){
            for(int j = 0 ; j<4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i<2; i++){
            int total = 0 ;
            for(int j = 0 ; j<4; j++){
                total+=arr[i][j];
            }
            double avg = (double) total / 4;
            System.out.printf("%.1f ",avg);
        }
        System.out.println();

        for(int j = 0; j<4; j++){
            int total = 0 ;
            for(int i = 0 ; i<2; i++){
                total+=arr[i][j];
            }
            double avg = (double) total / 2;
            System.out.printf("%.1f ",avg);
        }
        System.out.println();

        int total = 0 ;
        for(int i = 0 ; i<2; i++){
            for(int j = 0; j<4; j++ ){
                total+=arr[i][j];
            }
        }
        double avg = (double) total / 8 ;
        System.out.printf("%.1f",avg);

    }
}