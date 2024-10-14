import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ns ="";
        char first = s.charAt(0);
        int cnt = 0 ;
        for(int i = 0 ; i<s.length(); i++){
            if(s.charAt(i) == first){
                cnt++;
            }else{
                ns+=s.charAt(i-1);
                ns+=cnt;
                cnt = 1;
                first = s.charAt(i);
            }
        }   
        ns+=s.charAt(s.length()-1);
        ns+=cnt;
        
        System.out.println(ns.length());
        System.out.println(ns);

    }
}