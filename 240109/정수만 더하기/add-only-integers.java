import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        String word = sc.next();
        int tal = 0 ;
        for (int i = 0 ; i<word.length(); i++){
            if(word.charAt(i)>='0' && word.charAt(i)<='9'){
                tal += (word.charAt(i)-'0');
                
            }
        }
        System.out.print(tal);
        
    }
}