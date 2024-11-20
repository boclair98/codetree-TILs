import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> v = new ArrayList<>();

        for (int i = 0; i<n; i++){
            String s = sc.next();
            if(s.equals("push_back")){
                int k = sc.nextInt();
                v.add(k);
            }else if( s.equals("pop_back")){
                v.remove(v.size()-1);
            }else if(s.equals("size")){
                System.out.println(v.size());
            }else{
                int idx = sc.nextInt();
                System.out.println(v.get(idx-1));
            }
        }
    }
}