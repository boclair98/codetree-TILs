import java.util.Scanner;
public class Main {
    
    public static boolean chage(String s){
        int total = 1 ;

        for(int i = 0; i<s.length()-1; i++){
            if (s.charAt(i)!=s.charAt(i+1)){
                total++;
            }
        }
        if (total>=2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if(chage(s)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}