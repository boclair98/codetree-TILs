import java.util.*;
public class Main {
    public static int n,size;
    public static int[][] paper = new int[201][201];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int now = 100;
        for(int s = 1; s<=n; s++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            if(s % 2 == 1){
                for(int i = x1+now; i<x2+now; i++){
                    for(int j = y1+now; j<y2+now; j++){
                        paper[i][j] = 1;
                    }
                }
            }else{
                for(int i = x1+now; i<x2+now; i++){
                    for(int j = y1+now; j<y2+now; j++){
                        paper[i][j] = 2;
                    }
                }
            }
        }

        for(int i = 0 ; i<201; i++){
            for(int j = 0 ; j<201; j++){
                if(paper[i][j] == 2){
                    size++;
                }
            }
        }   
        System.out.println(size);

    }
}