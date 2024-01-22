import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dx= new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};
        int start1,start2;
        start1 = 0 ;
        start2 = 0;
        for(int i = 0 ; i<n; i++){
            char word = sc.next().charAt(0);
            int num = sc.nextInt();

            if (word=='E'){
                start1 += num;
            }
            else if(word=='W'){
                start1 -=num;
            }
            else if(word=='S'){
                start2-=num;
            }
            else{
                start2+=num;
            }
            
        }
        System.out.print(start1+" "+start2);
    }
}