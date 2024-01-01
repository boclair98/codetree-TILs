import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] total = new int[3][3];
        for(int i = 0 ; i<3; i++){
            for(int j = 0 ; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0 ; i<3; i++){
            for(int j = 0 ; j<3; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i<3; i++){
            for(int j = 0 ; j<3; j++){
                total[i][j] = arr[i][j] * arr2[i][j];
                System.out.print(total[i][j]+" ");
            }
            System.out.println();
        }
    }
}