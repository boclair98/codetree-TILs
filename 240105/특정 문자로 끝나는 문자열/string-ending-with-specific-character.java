import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] word = new String[10];

        for (int i = 0; i<10; i++){
            word[i] = sc.next();
        }
        char wor = sc.next().charAt(0);
        int cnt = 0 ;

        for(int i = 0 ; i<10; i++){
            int len = word[i].length();
            if (word[i].charAt(len - 1)==wor){
                System.out.println(word[i]);
                cnt++;
            }
        }
        if (cnt == 0 ){
            System.out.print("None");
        }

    }
}