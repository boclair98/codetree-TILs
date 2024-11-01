import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        int d = (int) a ;
        int c = (int) b ;
        System.out.print(d+c+" ");
        if(d>c){
            System.out.print(d-c);
        }else{
            System.out.print(c-d);
        }
    }
}