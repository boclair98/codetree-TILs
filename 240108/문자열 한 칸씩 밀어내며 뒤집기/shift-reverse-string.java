import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = sc.nextInt();

        for (int i = 0 ; i<n; i++){
            int num = sc.nextInt();
            if ( num == 1){
                word = word.substring(1,word.length()) + word.substring(0,1);
                System.out.println(word);
            }
            else if(num==2){
                word = word.substring(word.length()-1,word.length()) + word.substring(0,word.length()-1);
                System.out.println(word);
            }
            else if(num==3){
                

                StringBuffer sb = new StringBuffer(word);
                word = sb.reverse().toString();
                System.out.println(word);
                
            }
        }

    }
}