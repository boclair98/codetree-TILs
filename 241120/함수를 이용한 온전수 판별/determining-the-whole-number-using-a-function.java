import java.util.Scanner;
public class Main {

    public static boolean on(int a){
        if(a%2 == 0){
            return true;
        }else if (a % 10 ==5){
            return true;
        }else if( a % 3 == 0 && a%9!=0){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;

        for(int i=a; i<=b; i++){
            if(!on(i)){
                total++;
            }
        }
        System.out.println(total);
    }
}