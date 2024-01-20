import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = sc.next();
        int cnt  = 0 ;

        for(int i = 0 ; i<n; i++){

            for(int j = i+1; j<n; j++){

                for(int k = j+1; k<n; k++){
                   if(word.charAt(i)=='C' && word.charAt(j)=='O' && word.charAt(k)=='W'){
                        cnt++;
                   } 
                }
            }
        }
        System.out.print(cnt);
    }
}