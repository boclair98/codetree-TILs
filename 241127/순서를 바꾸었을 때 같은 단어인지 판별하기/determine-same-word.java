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
        Arrays.sort(arr2);
        String word1 = new String(arr);
        String word2 = new String(arr2);

        if(word2.equals(word1)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}