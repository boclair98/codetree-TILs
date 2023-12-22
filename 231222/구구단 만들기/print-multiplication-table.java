import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int j = 1; j<=9; j++){
            for(int i = m; i>=n; i--){
                if(i%2 == 0){
                
                    System.out.print(i+" * "+j+" = "+i*j);
                    if (i!=n){
                        System.out.print(" / ");
                    }
                    
                
                }
                
            }
            System.out.println();
        }
    }
}