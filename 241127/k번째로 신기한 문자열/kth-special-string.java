import java.util.*;
public class Main {
    private static int n,k,cnt;
    private static String word;
    private static String[] arr1, arr2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        n = sc.nextInt();
        k = sc.nextInt();
        word = sc.next();
        arr1 = new String[n];
        arr2 = new String[n];

        for(int i = 0; i<n; i++){
            arr1[i] = sc.next();
        }
        
        //확인 하기
        for(int i = 0; i<n; i++){
            if(check(arr1[i],word)){
                arr2[cnt] = arr1[i];
                cnt++;
            }
        }
        Arrays.sort(arr2,0,cnt);
        System.out.println(arr2[k-1]);
    }

    public static boolean check(String arr, String word){
        if( arr.length() < word.length()){
            return false;
        }
        for(int i = 0; i<word.length(); i++){
            if(arr.charAt(i) != word.charAt(i)){
                return false;
            }
        }
        return true;

        
    }
    
}