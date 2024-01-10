import java.util.Scanner;

public class Main {
    public static boolean sosu(int i){
        if (i == 1){
            return false;
        }
        
        for (int k=2; k<i; k++){
            if (i%k == 0 ){
                return false;
                }
            }
        return true;
        }
        
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0 ;
        for(int i = a; i<=b; i++){
            if(sosu(i)){
                sum+=i;
            }
        }
        System.out.print(sum);
        
    }
}