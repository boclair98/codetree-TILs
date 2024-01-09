import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tal = 0 ; 
        for(int i = 0 ; i<n; i++){
            tal+= sc.nextInt();
        }
        String num = Integer.toString(tal);

        num = num.substring(1,num.length()) + num.substring(0,1);
        System.out.print(num);
    }
}