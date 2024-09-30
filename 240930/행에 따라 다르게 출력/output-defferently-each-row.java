import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for(int i =1; i<=n; i++){
            if(i%2 == 1){
                for(int j = 0 ; j<n; j++){
                    System.out.print(cnt++ +" ");
                }
                cnt++;
            }
            else{
                for(int j = 0 ; j<n; j++){
                    System.out.print(cnt+" ");
                    cnt+=2;
                }
                cnt--;
            }
            System.out.println();
        }
        
    }
}