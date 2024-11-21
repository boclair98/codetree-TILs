import java.util.*;
public class Main {
    public static int n;
    public static int k;
    public static ArrayList<Integer> al = new ArrayList<>();
    public static void print(){
        for(int i =0; i<al.size(); i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
    }
    public static void recur(int cnt){
        if(cnt == n){
            print();
            return;
        }
        for(int i =1; i<=k; i++){
            al.add(i);
            recur(cnt+1);
            al.remove(al.size()-1);
        }

    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        recur(0);
        
    }
}