import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] arr = word.toCharArray(); 
        int startx = 0;
        int starty = 0;
        int dinum = 3;
        int[] x_y = new int[]{1,0,-1,0};
        int[] y_x = new int[]{0,-1,0,1};
        int x_tal1 = 0 ;
        int x_tal2 = 0;
        
        for(int i = 0 ; i<arr.length; i++){
            
            if(arr[i]=='L'){
                dinum = (dinum-1+4)%4;
            }
            else if(arr[i]=='R'){
                dinum = (dinum+1) %4;
            }
            else{
                startx = startx+x_y[dinum];
                starty+=y_x[dinum];
            }
            
    }
     System.out.print(startx+" "+starty);
}
}