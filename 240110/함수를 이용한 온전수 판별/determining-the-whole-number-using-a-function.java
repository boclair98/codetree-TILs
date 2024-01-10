import java.util.Scanner;
public class Main {
    public static boolean num(int a){
        if (a%2 == 0){
            return true;
        }
        else if (a%10 == 5){
            return true;
        }
        else if (a%3==0 && a%9!=0){
            return true;
        }
        else{
            return false;
        }

        
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int tal = 0 ;
        for(int i =n; i<=m; i++){
            if (!num(i)){
                tal++;
            }
        }
        System.out.print(tal);
    }
}