import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();

        for(int i = 0 ; i<len; i++){
            if(i == 1 || i == len-2){
                System.out.print('a');
            }else{
                System.out.print(s.charAt(i));
            }
        }

    }
}