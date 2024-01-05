import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String word2= sc.next();
        String word3 = word+word2;
        String word4 = word2+word;
        int cnt = 0 ;
        for (int i = 0 ; i<word3.length(); i++){
            if (word3.charAt(i)!=word4.charAt(i)){
                cnt++;
            }
        }
        if (cnt>0){
            System.out.print("false");
        }
        else{
            System.out.print("true");
        }
    }
}