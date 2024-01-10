import java.util.Scanner;
public class Main {
    public static boolean sosu(int a){
        
            for(int j =2; j<a; j++){
                if(a%j == 0 ){
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
        int cnt = 0 ;

        for(int i = a; i<=b; i++){
            if(sosu(i)){
                if (((i/10) + (i%10)) %2 == 0){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);

    }
}