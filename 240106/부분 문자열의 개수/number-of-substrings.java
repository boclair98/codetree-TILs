import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String word2= sc.next();
        int cnt = 0 ;
        for (int i = 0 ; i<word.length()-1; i++){
            int tal = 0 ;
            for(int j = 0 ; j<2; j++){
                if (word.charAt(i+j) == word2.charAt(j)){
                    tal++;
                }
            
            }
            if (tal == 2){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}