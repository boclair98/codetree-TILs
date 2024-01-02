import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int[][] arr = new int[10][10];
        int tal = n*n;
        if (n%2==1){
            for(int i = 0 ; i<n; i++){
                if(i%2 == 0){
                    for (int k = 0 ; k<n; k++){
                        arr[k][i] = tal;
                        tal --;
                    }
                }
                else{
                    for (int h = n-1 ; h>=0; h-- ){
                        arr[h][i] =tal;
                        tal --;
                    }
                }
            }
        }
        else{
            for(int i = 0 ; i<n; i++){
                if(i%2 == 1){
                    for (int k = 0 ; k<n; k++){
                        arr[k][i] = tal;
                        tal --;
                    }
                }
                else{
                    for (int h = n-1 ; h>=0; h-- ){
                        arr[h][i] =tal;
                        tal --;
                    }
                }
            }
        }

        for (int i = 0 ; i<n; i++){
            for (int j = 0 ; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}