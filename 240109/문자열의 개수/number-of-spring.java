import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] word = new String[201];
        int tal = 0 ; 
        int cnt = 0 ;
        while (true){
            word[tal] = sc.next();

            if(word[tal].equals("0")){
                break;
            }
            tal++;
        }
        System.out.println(tal);

        for (int i = 0 ; i<tal; i+=2){
            System.out.println(word[i]);
        }
    }
}