import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String word2= sc.next();
        int tal = 0 ;

        boolean na = false;

        for (int i = 0; i<word.length(); i++){
            word = word.substring(word.length()-1) + word.substring(0,word.length()-1);
            tal ++;
            
            if (word.equals(b)){
                System.out.print(tal);
                break;
            }
        }
        if (i == word.length()-1){
            System.out.print(-1);
        }
        }
        
    }