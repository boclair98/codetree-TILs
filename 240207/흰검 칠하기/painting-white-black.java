import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] tile = new int[201];
        String[] visited = new String[201];
        
        for(int i = 0; i<201; i++){
            visited[i]="No";
        }
        int left = 100;
        int right = 100;

        for (int i = 0; i<n; i++){
            int a = sc.nextInt();
            char word = sc.next().charAt(0);

            if (word=='R'){
                right = left + a;
                
                for (int j = left; j<right; j++){
                    visited[j] ="Black";
                    tile[j] +=1;
                }
                
            }

            if(word=='L'){
                left = right  - a;
                for (int j = left; j<right; j++){
                    visited[j] ="White";
                    tile[j] +=1;
                }
            }
            
        }
        int white = 0;
        int black = 0;
        int gray = 0 ;
        for (int i = 0; i<201; i++){
            if(visited[i].equals("White")&& tile[i]<4){
                white+=1;
            }
            if (visited[i].equals("Black") && tile[i]<4){
                black+=1;
            }
            if(tile[i]>3){
                gray+=1;
            }
        }
        System.out.print(white+" "+black+" "+gray);
    }
}