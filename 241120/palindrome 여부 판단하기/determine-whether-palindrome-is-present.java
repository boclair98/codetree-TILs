import java.util.Scanner;
public class Main {
    public static boolean check(String s, char[] arr){
        for (int i = s.length(); i>0; i--){
            arr[s.length()-i] = s.charAt(i-1);
        }
        boolean isarr = false;

        for(int i = 0; i<arr.length; i++){
            if (arr[i]!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = new char[s.length()];

        boolean ss = check(s,arr);
        if(ss ==true){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}