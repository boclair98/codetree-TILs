import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for(int i = 1; i<=n; i++){

            if (i%2 == 1){
                for(int k = 1; k<=3; k++){
                    System.out.print(cnt+" ");
                    if(k!=n){
                        cnt++;
                    }
                    
                }
            }
            else{
                cnt = cnt * i ;
                for(int t = 1 ; t<=n; t++){
                    System.out.print(cnt+" ");
                    if(t!=n){
                        cnt--;
                    }
                    
                }
                cnt=cnt+n;
            }
            
            System.out.println();
        }


    }
}