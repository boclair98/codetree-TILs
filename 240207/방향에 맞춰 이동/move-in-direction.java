import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dx = new int[]{0,0,-1,1};
        int[] dy = new int[]{-1,1,0,0};
        int x = 0;
        int y = 0;
        for (int i = 0; i<n; i++){
            char word = sc.next().charAt(0);
            int num = sc.nextInt();
            for(int j = 0 ; j<num; j++){
                if(word =='N'){
                    x = x + 1;
                }
                if(word =='E'){
                    y = y+ 1;
                }
                if (word=='S'){
                    x = x- 1;
                }
                if (word=='W'){
                    y = y- 1;
                }
                
            }
            

        }
        System.out.println(y+" "+x);
        
    }
}