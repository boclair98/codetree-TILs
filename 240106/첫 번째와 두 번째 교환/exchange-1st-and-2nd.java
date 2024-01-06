import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char fir = word.charAt(0);
        char two = word.charAt(1);
        String word3 = "";

        for (int i = 0 ; i<word.length(); i++){
            if (word.charAt(i)==fir){
                word3+=two;
            }
            else if (word.charAt(i)==two){
                word3+=fir;
            }
            else{
                word3+=word.charAt(i);
            }
        }

        for(int i = 0 ; i<word3.length(); i++){
            System.out.print(word3.charAt(i));
        }
        
    }
}