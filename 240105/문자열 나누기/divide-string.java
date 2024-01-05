import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        String[] word = new String[10];
        for(int i = 0 ; i<n; i++){
            word[i] = sc.next();
        }
        String word_mall ="";

        for (int i = 0 ; i<n; i++){
            word_mall+=word[i];
        }

        for(int i = 0 ; i<word_mall.length(); i++){
            System.out.print(word_mall.charAt(i));
            if((i+1)%5 == 0){
                System.out.println();
            }
        }
    }
}