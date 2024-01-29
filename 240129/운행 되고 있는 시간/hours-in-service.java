import java.util.Scanner;
public class Main {
    public static int n ;
    public static int[] x = new int[100];
    public static int[] y = new int[100];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0 ; i< n ; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int maxval = 0;
        
        for (int i = 0; i<n; i++){
            int[] count = new int[1000];
            for(int j = 0 ; j<n; j++){
                if( i == j ){
                    continue;
                }
                for (int k=x[j]; k<y[j]; k++){
                    count[k]++;
                }
            }
            int time = 0 ;

            for(int j = 1; j<1000; j++){
                if(count[j]>0){
                    time++;
                }
            }
            maxval = Math.max(time,maxval);
        }
        System.out.print(maxval);


    }
}