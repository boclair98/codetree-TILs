import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        String[] word = new String[]{"apple","banana","grape","blueberry","orange"};


        int cnt = 0 ;

        for(int i = 0 ; i<5; i++){
            if(word[i].charAt(2) == n || word[i].charAt(3) == n){
                System.out.println(word[i]);
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}