import java.util.Scanner;
public class Main {
    public static int start = 3;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};
        int x = 0;
        int y = 0;
        
        for (int i = 0; i<word.length(); i++){
            char wor = word.charAt(i);
            if (wor =='L'){
                start= (start -1 + 4) % 4;
            }
            if (wor=='R'){
                start = (start  +1 ) % 4;
            }
            if (wor =='F'){
                x += dx[start];
                y += dy[start];
            }
            

        }
        System.out.print(x+" "+y);
    }
}