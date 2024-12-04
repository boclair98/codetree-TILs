import java.util.*;
public class Main {
    public static int n,x,y;
    public static int[] dx = new int[]{1,0,-1,0};
    public static int[] dy = new int[]{0,-1,0,1};
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = 0;
        y = 0;

        for(int i = 0; i<n; i++){
            char word = sc.next().charAt(0);
            int cnt = sc.nextInt();
            if(word =='E'){
                for(int j = 0; j<cnt; j++){
                    x = x + dx[0];
                    y = y + dy[0];    
                }
                
            }else if(word =='S'){
                for(int j = 0; j<cnt; j++){
                    x = x + dx[1];
                    y = y + dy[1];    
                }
            }else if(word =='W'){
                for(int j = 0; j<cnt; j++){
                    x = x + dx[2];
                    y = y + dy[3];    
                }
            }else{
                for(int j = 0; j<cnt; j++){
                    x = x + dx[3];
                    y = y + dy[3];    
                }
            }

        }
        System.out.println(x+" "+y);
    }
}