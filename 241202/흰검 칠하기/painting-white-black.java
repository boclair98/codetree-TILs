import java.util.*;
public class Main {
    private static int[] color = new int[2001];
    private static String[] colors = new String[2001];
    private static int white,black,gray,now;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        now = 1000;
        for(int s = 0; s<n; s++){
            int number = sc.nextInt();
            char word = sc.next().charAt(0);
            if(word =='R'){
                for(int i = now; i<now+number; i++ ){
                    color[i] = color[i] + 1;
                    colors[i] = "black";
                }
                now = now + number;
            }else{
                for(int i = now-1; i>=now-number; i--){
                    color[i] = color[i] + 1;
                    colors[i] = "white";
                }
                now = now - number;
            }
        }

        for(int i = 0; i<2001; i++){
            if(color[i]>=4){
                gray++;
            }else if(colors[i]=="white"){
                white++;
            }else if(colors[i]=="black"){
                black++;
            }
        }
        System.out.println(white+" "+black+" "+gray);
        // for(int i = 995; i<1010; i++){
        //     System.out.print(color[i]+" ");
        // }
    }
}