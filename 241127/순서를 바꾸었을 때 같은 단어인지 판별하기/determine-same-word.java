import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr = str1.toCharArray();
        Arrays.sort(arr);
        
        char[] arr2 = str2.toCharArray();
        Arrays.sort(str2);

        if(str1.equals(str2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}