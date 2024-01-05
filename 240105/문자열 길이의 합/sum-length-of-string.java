import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] word = new String[n];
        int tal = 0 ;
        int val = 0 ;
        for (int i = 0 ; i<n; i++){
            word[i] = sc.next();
            tal +=word[i].length();
            if(word[i].charAt(0)=='a'){
                val+=1;
            }
        }
        System.out.print(tal+" "+val);
    }
}