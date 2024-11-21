//1이상 4이하로 이루어지면서 정확히 해당 숫자만큼 연달아 같은 숫자가 나오는 숫자를 아름다운수
import java.util.*;
public class Main {
    private static int n ;
    private static int count;
    private static ArrayList<Integer> al = new ArrayList<>();
    public static boolean isbeautiful(){
        for(int i = 0; i<n; i+=al.get(i)){

            if(i+al.get(i)-1 >=n){
                return false;
            }

            for(int j =i; j<i+al.get(i); j++){
                if(al.get(j)!=al.get(i)){
                    return false;
                }
            }
        }
        return true;

    }
    public static void recur(int cnt){
        if(cnt == n){
            if(isbeautiful()){
                count++;
                
            }
            return;
        }
        for(int i =1; i<=4; i++){
            al.add(i);
            recur(cnt+1);
            al.remove(al.size()-1);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        recur(0);
        System.out.println(count);
    }
}