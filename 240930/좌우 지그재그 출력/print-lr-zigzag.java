import java.util.Scanner;
public class Main {
    private static int cnt = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0 ; i<n; i++){
            if(i%2==1){
                cnt+=n-1;
            }
            for(int j = 0; j<n; j++){
                if(i%2 == 0){
                    System.out.print(cnt++ +" ");
                }else{
                    
                    System.out.print(cnt-- +" ");
                    if (j ==n-1){
                        cnt+=n+1;
                    }
                }
            }
            System.out.println();
        }


    }
}