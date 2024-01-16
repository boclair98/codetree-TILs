import java.util.Scanner;
import java.util.Arrays;
class point implements Comparable<point>{
    int x,y;

    public point(int x, int y){
        this.x = x;
        this.y = y;
        
    }
    public int compareTo(point point1){
        if (x!=point1.x){
            return x-point1.x;
        }
        return y - point1.y;
    }
}
public class Main {
    public static int xandy(int x, int y){
            return Math.abs(x) + Math.abs(y);
        }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        point[] peo = new point[n];

        int x, y;

        for(int i = 0 ; i<n; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            peo[i] = new point(xandy(x,y),i+1);
        }
        Arrays.sort(peo, 0, n);

        for(int i = 0; i < n; i++)
            System.out.println(peo[i].y);
    }
}