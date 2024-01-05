import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        boolean a = false;
        int cnt = 0 ;
        for(int i = 1; i<word.length(); i++){
            if (word.charAt(i-1)=='e' && word.charAt(i) =='e'){
                cnt++;
            }
            
        }
        if (cnt>0){
            System.out.print("Yes ");
        }
        else{
            System.out.print("No ");
        }

        int cnt2 = 0 ;
        for(int i = 1; i<word.length(); i++){
            if (word.charAt(i-1)=='a' && word.charAt(i) =='b'){
                cnt2++;
            }
            
        }

        if (cnt2>0){
            System.out.print("Yes ");
        }
        else{
            System.out.print("No ");
        }

    }
}