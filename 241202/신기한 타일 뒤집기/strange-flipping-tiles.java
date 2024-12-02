import java.util.*;
public class Main {
    public static String[] color = new String[100001];
    public static int n,white,black; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int now = 10000;
        for(int s = 0; s<n; s++){
            int number = sc.nextInt();
            char word = sc.next().charAt(0);
            if(word == 'R'){
                for(int i = now; i<now+number; i++){
                    color[i] ="black";
                }
                now = now + number - 1;
            }else{
                for(int i = now; i>now-number; i--){
                    color[i] = "white";
                }
                now = now - number + 1;
            }
        }

        for(int i = 0; i<100001; i++){
            if(color[i]=="black"){
                black++;
            }else if(color[i]=="white"){
                white++;
            }
        }
        System.out.print(white+" "+black);
    }
}