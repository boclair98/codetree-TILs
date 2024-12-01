import java.util.*;
public class Main {
    private static String[] color = new String[10000];
    private static int[] blackcolor = new int[10000];
    private static int[] yellowcolor = new int[10000];
    private static int[] first = new int[10000];
    private static int white,black,gray,now;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        now = 100;
        for(int s = 0; s<n; s++){
            int number = sc.nextInt();
            char word = sc.next().charAt(0);
            if(word =='R'){
                for(int i = now; i<now+number; i++ ){
                    blackcolor[i] = blackcolor[i]+1;
                    color[i] ="black";

                }
                now = now + number-1;
            }else{
                for(int i = now; i>now-number; i--){
                    yellowcolor[i] = yellowcolor[i]+1;
                    color[i] ="white";
                }
                now = now - number+1;
            }
        }

        for(int i = 0; i<20001; i++){
            if(blackcolor[i]>=2 && yellowcolor[i]>=2){
                gray++;
            }else if(color[i]=="black"){
                black++;
            }else if(color[i]=="white"){
                white++;
            }
        }
        System.out.println(white+" "+black+" "+gray);
        // for(int i = 995; i<1010; i++){
        //    System.out.print(first[i]+" ");
        // } 
    }
}