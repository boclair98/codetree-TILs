import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] arr = word.toCharArray(); 
        int startx = 0;
        int starty = 0;

        int[] x_y = new int[]{1,0,-1,0};
        int[] y_x = new int[]{0,-1,0,1};

        for(int i = 0 ; i<arr.length-1; i++){
            if(arr[i]=='L'&& arr[i+1]=='F'){
                startx-=1;
            } else if(arr[i]=='R' && arr[i+1]=='F'){
                startx+=1;
            }
        System.out.print(startx+" "+starty);


    }
}
}