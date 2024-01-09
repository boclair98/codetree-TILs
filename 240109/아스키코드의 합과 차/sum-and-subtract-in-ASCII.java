import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = (int) sc.next().charAt(0);
        int b = (int) sc.next().charAt(0);
        int tal = a+b;
        
        if (a>b){
            int min = a-b;
            System.out.print(tal+" "+min);
        }
        else{
            int min = b- a;
            System.out.print(tal+" "+min);
        }

        

    }
}