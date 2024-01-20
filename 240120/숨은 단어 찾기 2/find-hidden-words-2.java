import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] word = new String[n];

        for(int i = 0 ; i<n; i++){
            word[i] = sc.next();
        }

        int cnt = 0 ;

        for(int i = 0; i<n; i++){
            for (int j = 0 ; j<m-2; j++){
                if (word[i].charAt(j)=='L' && word[i].charAt(j+1)=='E' && word[i].charAt(j+2)=='E'){
                    cnt++;
                }
                else if (word[i].charAt(j)=='E' && word[i].charAt(j+1)=='E' && word[i].charAt(j+2)=='L'){
                    cnt++;
                }

            }
        }

        for (int i = 0 ; i<n-2; i++){
            for(int j = 0 ; j<m; j++){
                if(word[i].charAt(j)=='L' && word[i+1].charAt(j)=='E' && word[i+2].charAt(j)=='E'){
                    cnt++;
                }
                if(word[i].charAt(j)=='E' && word[i+1].charAt(j)=='E' && word[i+2].charAt(j)=='L'){
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
        

    }
}