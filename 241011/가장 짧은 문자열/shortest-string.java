import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String f = sc.next();
        String w = sc.next();
        String t = sc.next();
        

        int sf = f.length();
        int sw = w.length();
        int st = t.length();
        int max_val = sf;
        int min_val = sf;
        if(sf<sw){
            max_val = sw;
        }
        if(sw<st){
            max_val = st;
        }

        if(sw>min_val){
            min_val = sw;
        }
        if(st>min_val){
            min_val = st;
        }
        System.out.print(max_val-min_val);
    }
}