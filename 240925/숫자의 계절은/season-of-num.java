import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n<=2 || n==12){
            System.out.println("Winter");
        }else if(n<=5){
            System.out.println("Spring");
        }else if(n<=8){
            System.out.println("Summer");
        }else{
            System.out.println("Fall");
        }
        
    }
}