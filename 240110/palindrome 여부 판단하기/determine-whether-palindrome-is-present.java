import java.util.Scanner;
public class Main {
    public static boolean pall(String tot){
        for (int i = 0 ; i<tot.length(); i++){
            if(tot.charAt(i) != tot.charAt(tot.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        String word = sc.next();

        if(pall(word)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}