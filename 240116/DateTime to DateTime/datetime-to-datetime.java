import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tal = (a*24*60+b*60+c) - (11*24*60+11*60+11);
        if(tal>=0){
            System.out.print(tal);
        }
        else{
            System.out.print(-1);
        }
    }
}