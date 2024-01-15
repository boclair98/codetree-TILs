import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int n;
    public static int k;
    public static String m ;
    public static String[] word = new String[100];
    public static String[] new_word = new String[100];

    public static boolean same(String a, String b){
        if (a.length() < b.length()){
            return false;
        }
        
        for(int i = 0 ; i<b.length(); i++){
                if (a.charAt(i) != b.charAt(i)){
                    return false;
                }
            }
        return true;
        }
    
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();

        k = sc.nextInt();

        m = sc.next();

        int cnt = 0 ;
        for(int i = 0 ; i<n; i++){
            word[i] = sc.next();

            if (same(word[i],m)){
                new_word[cnt] = word[i];
                cnt++;
            }
        }

        Arrays.sort(new_word,0,cnt);

        System.out.print(new_word[k-1]);



        



    }
}