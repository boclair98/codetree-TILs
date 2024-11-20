import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();

        LinkedList<Character> l = new LinkedList<>();
        for (int i = 0; i<n; i++){
            l.add(str.charAt(i));
        }
        ListIterator<Character> it = l.listIterator(l.size());
        for (int i = 0; i<m; i++){
            char s = sc.next().charAt(0);
            if (s =='L'){
                if(it.hasPrevious()){
                    it.previous();
                }
            } else if(s =='R'){
                if(it.hasNext()){
                    it.next();
                }
            }else if( s =='D'){
                if(it.hasNext()){
                    it.next();
                    it.remove();
                }
            }else{
                char d = sc.next().charAt(0);
                it.add(d);
            }
        }
        it = l.listIterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }

    }
}