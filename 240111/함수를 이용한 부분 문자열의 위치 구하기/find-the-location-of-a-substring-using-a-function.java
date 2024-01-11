import java.util.Scanner;
public class Main {
    public static int word3(String word, String word2){
        int cnt = 0 ; 
        for (int i = 0 ; i<=word.length()-word2.length(); i++){
            cnt = 0 ;
            for(int j = 0 ; j<word2.length(); j++){
                if (word.charAt(i+j) == word2.charAt(j)){
                    cnt++;
                }
            }
            if(cnt == word2.length()){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String word2 = sc.next();

        System.out.print(word3(word,word2));
    }
}