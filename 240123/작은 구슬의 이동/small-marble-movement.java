import java.util.Scanner;
public class Main {
    public static int n,m,dir,x,y;
    public static int[] x_r = new int[]{0,1,-1,0};
    public static int[] y_r = new int[]{1,0,0,-1};
    public static int[] mapper = new int[128];
    public static boolean inrange(int x, int y){
        return x>=0 && x<n && y>=0 && y<n;
    }
    public static void simulate(){
        while (m-- >0){
            int nx = x+x_r[dir],ny = y+y_r[dir];
            if(inrange(nx,ny)){
                x = nx;
                y = ny;
            }
            else{
                dir = 3 - dir;
            }
        }
    }
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n  = sc.nextInt();
        m = sc.nextInt();
        mapper['R'] = 0 ;
        mapper['D'] = 1 ;
        mapper['U'] = 2 ;
        mapper['L'] = 3 ;

        x = sc.nextInt();
        y = sc.nextInt();
        char cdir = sc.next().charAt(0);
        x--; y--; dir = mapper[cdir];

        simulate();
        System.out.print((x+1)+" "+(y+1));
    
}
}