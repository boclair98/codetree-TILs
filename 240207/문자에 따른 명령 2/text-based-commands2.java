import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] dy = new int[]{1,-1,0,0};
        int[] dx = new int[]{0,0,-1,1};
        int x = 0;
        int y = 0;
        int start = 0;
        for (int i = 0; i<word.length(); i++){
            char wor = word.charAt(i);
            if (wor =='L'){
                start= (start +1) % 4;
            }
            if (wor=='R'){
                start = (start -1 +4) % 4;
            }
            if (wor =='F'){
                x += x+dx[start];
                y += y+dy[start];
            }
            

        }
        System.out.print(y+" "+x);
    }
}