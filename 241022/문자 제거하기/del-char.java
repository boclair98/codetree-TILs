import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while(true){
            int idx = sc.nextInt();
            if (idx >= s.length()){
                s = s.substring(0,s.length()-1);
                System.out.println(s);
            }else {
                s = s.substring(0,idx) + s.substring(idx+1);
                System.out.println(s);
                
            }

            if (s.length() == 1){
                
                break;
            }
            
        }

    }
}