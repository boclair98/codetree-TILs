import java.util.*;
public class Main {
    public static int[][] paper = new int[2001][2001];
    public static int size,total,max_x,max_y,min_x,min_y;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int now = 1000;
        for(int s = 0; s<2; s++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for(int i = x1+now; i<x2+now; i++){
                for(int j = y1 + now; j<y2+now; j++){
                    if(s == 0){
                        paper[i][j] = 1;
                    }else{
                        paper[i][j] = 2 ;
                    }
                }
            }
        }
        min_x = 1000001;
        min_y = 1000001;
        boolean square = false;
        for(int i = 0; i<2001; i++){
            for(int j = 0; j<2001; j++){
                if(paper[i][j] == 1){
                    square = true;
                    min_x = Math.min(min_x,i);
                    max_x = Math.max(max_x,i);
                    min_y = Math.min(min_y,j);
                    max_y = Math.max(max_y,j);
                }
            }
        }
        if(!square){
            System.out.println(0);
        }else{
            System.out.println((max_x-min_x+1)*(max_y-min_y+1));
        }
        
        
        

    }
}