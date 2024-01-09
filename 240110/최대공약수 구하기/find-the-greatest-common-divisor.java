import java.util.Scanner;
public class Main {
    public static void cmcm(int a, int b){
        int num = 0 ;
        for(int i = 1; i<=b; i++){
            if(a%i==0 && b%i==0 && num<i){
                num = i;
        }
        
    }
        System.out.print(num);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        cmcm(n,m);
    }
}