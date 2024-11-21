import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i<n; i++){
            String str = sc.next();
            if(str.equals("push")){
                int k = sc.nextInt();
                queue.add(k);
            }else if(str.equals("pop")){
                System.out.println(queue.poll());
            }else if(str.equals("size")){
                System.out.println(queue.size());
            }else if(str.equals("empty")){
                if(queue.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else{
                System.out.println(queue.peek());
            }

        }

    }
}