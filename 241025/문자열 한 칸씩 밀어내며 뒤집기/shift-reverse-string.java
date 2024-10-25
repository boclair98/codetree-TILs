import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = sc.nextInt();
        int state = 0 ;
        while (state<cnt){
            int n = sc.nextInt();
            if (n == 1){
                s = s.substring(1,s.length()) + s.substring(0,1);
            }else if(n == 2){
                s = s.substring(s.length()-1,s.length()) + s.substring(0,s.length()-1);

            } else if(n == 3){
                StringBuffer sb = new StringBuffer(s);
                s = sb.reverse().toString();
                

                
            }
            System.out.println(s);
            state++;
        }
    }
}