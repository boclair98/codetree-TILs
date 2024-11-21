import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i<n; i++){
            String str = sc.next();
            if(str.equals("push_front")){
                int k = sc.nextInt();
                deque.addFirst(k);
            }else if(str.equals("push_back")){
                int k = sc.nextInt();
                deque.addLast(k);
            }else if(str.equals("pop_front")){
                System.out.println(deque.pollFirst());
            }else if(str.equals("pop_back")){
                System.out.println(deque.pollLast());
            }else if(str.equals("size")){
                System.out.println(deque.size());
            }else if(str.equals("empty")){
                if(deque.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(str.equals("front")){
                System.out.println(deque.peekFirst());
            }else{
                System.out.println(deque.peekLast());
            }

        }

    }
}