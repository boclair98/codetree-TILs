import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ss = sc.next();
        for(int i = 0 ; i<ss.length();i++){
            if(i==0||i==1){
                System.out.print(s.charAt(i));
            }else{
                System.out.print(ss.charAt(i));
            }
        }
    }
}